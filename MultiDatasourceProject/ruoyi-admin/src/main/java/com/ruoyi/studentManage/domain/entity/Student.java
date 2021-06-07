package com.ruoyi.studentManage.domain.entity;

import java.io.Serializable;

/**
 * Created by Ben on 2021/6/6.
 */

public class Student implements Serializable {
    private String id;
    private String name;
    private String addr;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
