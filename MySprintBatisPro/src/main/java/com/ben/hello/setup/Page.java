package com.ben.hello.setup;

import lombok.Getter;
import lombok.Setter;

/**
 * 简单的分页对象
 * @author ben
 * @date 2017/12/9
 * Created by hasee on 2017/12/4.
 */
public class Page<T> {
    @Getter@Setter
    //当前页数
    private int pageNum = 1;
    @Getter@Setter
    //每页显示条数
    private int pageSize = 10;
    @Getter@Setter
    private int totalRecord;
    @Getter@Setter
    private int totalPage;

    public Page(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Page() {

    }
}