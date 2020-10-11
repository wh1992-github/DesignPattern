package com.example.jingbin.designpattern.builder;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2020-01-31.
 * 产品类
 */

public class Product {
    private static final String TAG = "Product";

    private String name;
    private String type;

    public void showProduct() {
        LogUtil.i(TAG, "名称 = " + name + ", 型号 = " + type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
