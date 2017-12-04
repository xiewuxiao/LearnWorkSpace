package com.ben.hello.setup;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hasee on 2017/12/4.
 */
@Intercepts({@Signature(
        type= StatementHandler.class,
        method = "prepare",
        args = {Connection.class})})
public class PageHelper implements Interceptor {
    @Setter
    private String sqlRegEx;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        RoutingStatementHandler handler = (RoutingStatementHandler)invocation.getTarget();
        StatementHandler delegate = (StatementHandler) getFieldValue(handler, "delegate");
        BoundSql boundSql = delegate.getBoundSql();
        MappedStatement mappedStatement = (MappedStatement) getFieldValue(delegate, "mappedStatement");
        // 获取参数
        Object parameterObject = boundSql.getParameterObject();
        // 判断是否分页
        if (mappedStatement.getId().matches(sqlRegEx)) {
            Page page = (Page) ((Map<?, ?>) parameterObject).get("page");
            if (page != null) {
                Connection connection = (Connection) invocation.getArgs()[0];
                // 获取mapper映射文件中对应的sql语句
                String sql = boundSql.getSql();
                // 给当前page参数设置总记录数
                this.setPageParameter(mappedStatement, connection, boundSql, page);
                // 获取分页sql语句
                String pageSql = this.getPageSql(page, sql);
                setFieldValue(boundSql, "sql", pageSql);
            }
        }
        return invocation.proceed();
    }

    @Override
    public void setProperties(Properties properties) {
        setSqlRegEx((String) properties.get("sqlRegEx"));
    }
    public static Object getFieldValue(Object obj, String fieldName) {
        Object result = null;
        Field field = getField(obj, fieldName);
        if (null != field) {
            field.setAccessible(true);
            try {
                result = field.get(obj);
            } catch (IllegalArgumentException e) {
//                e.printStackTrace();
            } catch (IllegalAccessException e) {
//                e.printStackTrace();
            }
        }
        return result;
    }

    private static Field getField(Object obj, String fieldName) {
        Field field = null;
        for (Class<?> clazz = obj.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                field = clazz.getDeclaredField(fieldName);
                break;
            } catch (NoSuchFieldException e) {
//                e.printStackTrace();
            }
        }
        return field;
    }

    public static void setFieldValue(Object obj, String fieldName, String fieldValue) {
        Field field = getField(obj, fieldName);
        if (null != field) {
            try {
                field.setAccessible(true);
                field.set(obj, fieldValue);
            } catch (IllegalArgumentException e) {
//                e.printStackTrace();
            } catch (IllegalAccessException e) {
//                e.printStackTrace();
            }
        }
    }
    private void setPageParameter(MappedStatement mappedStatement, Connection connection, BoundSql boundSql, Page page) {
        // 获取mapper映射文件中对应的sql语句
        String sql = boundSql.getSql();
        // 获取计算总记录数的sql语句
        String countSql = this.getCountSql(sql);
        // 获取BoundSql参数映射
        List<ParameterMapping> parameterMappinglist = boundSql.getParameterMappings();
        // 构造查询总量的BoundSql
        BoundSql countBoundSql = new BoundSql(mappedStatement.getConfiguration(), countSql, parameterMappinglist, boundSql.getParameterObject());
        ParameterHandler parameterHandler = new DefaultParameterHandler(mappedStatement, boundSql.getParameterObject(), countBoundSql);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 通过connection建立countSql对应的PreparedStatement对象
            pstmt = connection.prepareStatement(countSql);
            parameterHandler.setParameters(pstmt);
            // 执行countSql语句
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int totalRecord = rs.getInt(1);
                page.setTotalRecord(totalRecord);
                page.setTotalPage(totalRecord/page.getPageSize() + (totalRecord % page.getPageSize() == 0? 0: 1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据源sql语句获取对应的查询总记录数的sql语句
     * @param sql
     * @return
     */
    private String getCountSql(String sql) {
        int index = sql.indexOf("from");//这里其实最好把那些order by 的去掉,这样效率会更快
        return "select count(*) " + sql.substring(index);
    }

    /**
     * 获取MySql数据库的分页查询语句 这种是用mysql方式的
     * @param page
     * @param sql
     * @return
     */
    private String getPageSql(Page<?> page, String sql) {
        StringBuffer sqlBuffer = new StringBuffer(sql);
        int offset = (page.getPageNum() - 1) * page.getPageSize();
        sqlBuffer.append(" limit ").append(offset).append(",").append(page.getPageSize());
        return sqlBuffer.toString();
    }

    /**
     * 只处理StatementHandler类型
     * @param o
     * @return
     */
    public Object plugin(Object o) {
        if (o instanceof  StatementHandler) {
            return Plugin.wrap(o, this);
        } else {
            return o;
        }
    }
}
