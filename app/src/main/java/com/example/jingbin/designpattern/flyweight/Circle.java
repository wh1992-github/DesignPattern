package com.example.jingbin.designpattern.flyweight;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2020-02-01.
 * 2. 创建实现接口的实体类。
 */

public class Circle implements Shape {
    private static final String TAG = "Circle";
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        LogUtil.i(TAG, "Draw: [Color = " + color
                + ", x = " + x + ", y = " + y + ", radius = " + radius + "]");
    }
}
