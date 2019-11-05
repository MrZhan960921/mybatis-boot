package com.zcq.enums;

import lombok.Data;

/**
 * @Author: chaoqun
 * @Date: 2019/11/5 0:17
 */
public enum Sex {
    MALE(1, "男"),
    FEMALE(2, "女");
    private int id;
    private String name;

    Sex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
