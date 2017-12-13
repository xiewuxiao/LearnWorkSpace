package com.ben.hello.dao;

import com.ben.hello.po.Book;
import org.apache.ibatis.annotations.Flush;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by xiewuxiao@163.com on 2017-11-30 15:47:16.
 * @author ben
 * @date 2017/12/9
 * 图书数据访问接口
 */

public interface BookDAOMapper {
    /**
     * 获得所有图书
     * @return 返回所有的图书（list集合）
     */
    @Flush
    public List<Book> getAllBooks();

    /**
     * 根据图书编号获得图书对象
     * @param id book的id号，主键
     * @return 返回book对象
     */
    public Book getBookById(@Param("id") int id);

    /**
     * 添加图书
     * @param entity Book实例
     * @return 返回添加的条目
     */
    public int add(Book entity);

    /**
     * 根据图书编号删除图书
     * @param  id id号，主键
     * @return 返回删除的数量
     */
    public int delete(int id);

    /**
     * 更新图书
     * @param entity Book 实例
     * @return 返回更新的条目数
     */
    public int update(Book entity);
}