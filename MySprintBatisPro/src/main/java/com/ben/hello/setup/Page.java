package com.ben.hello.setup;

import lombok.Getter;
import lombok.Setter;


public class Page<T> {
    @Getter@Setter
    private int pageNum = 1;//当前第几页
    @Getter@Setter
    private int pageSize = 10;//每页显示条数
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