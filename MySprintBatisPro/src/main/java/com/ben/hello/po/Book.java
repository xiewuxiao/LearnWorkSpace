package com.ben.hello.po;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiewuxiao@163.com on 2017-11-30 15:47:16.
 * @author ben
 * @date 2017/12/9
 * 图书实体
 */
public class Book implements Serializable {
    /**
     * 编号
     */
    @Getter
    @Setter
    private int id;
    /**
     * 书名
     */
    @Getter
    @Setter
    private String title;
    /**
     * 价格
     */
    @Getter
    @Setter
    private double price;
    /**
     * 出版日期
     */
    @Getter
    @Setter
    private Date publishDate;

    public Book(int id, String title, double price, Date publishDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    public Book() {
    }
    @Override
    public String toString() {
        return this.getTitle() + "---" + this.getId() + "----" + this.getPrice() + "--------";
    }
}