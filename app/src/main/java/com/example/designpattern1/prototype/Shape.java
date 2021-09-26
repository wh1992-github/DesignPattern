package com.example.designpattern1.prototype;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2020-01-31.
 * 1. 创建一个实现了 Cloneable 接口的抽象类。
 */
public abstract class Shape implements Cloneable {
    private static final String TAG = "Shape";
    private String id;
    protected String type;

    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            LogUtil.i(TAG, "CloneNotSupportedException = " + e.getMessage());
        }
        return object;
    }
}
