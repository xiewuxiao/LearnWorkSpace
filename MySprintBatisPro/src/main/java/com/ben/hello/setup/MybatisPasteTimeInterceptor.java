package com.ben.hello.setup;


import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;

/**
 * 数据库操作性能拦截器,记录耗时
 * @author ben
 * @date 2017/12/9
 * Created by hasee on 2017/12/4.
 */
@Intercepts(value = {
        @Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }),
        @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class }),
        @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class }) })
public class MybatisPasteTimeInterceptor implements Interceptor {
    Logger logger = LogManager.getLogger(this.getClass());
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        long startTM = System.currentTimeMillis();
        String sql_id = ((MappedStatement)invocation.getArgs()[0]).getId();
        Object result = invocation.proceed();
        long endTM = System.currentTimeMillis();
        logger.info("["+sql_id+"] sql执行耗时 [" + (endTM - startTM)  + " ms]");
        return result;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
