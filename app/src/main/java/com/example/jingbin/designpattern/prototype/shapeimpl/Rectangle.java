package com.example.jingbin.designpattern.prototype.shapeimpl;

import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.prototype.Shape;

/**
 * Created by test on 2020-01-31.
 * 2. 创建扩展了上面抽象类的实体类。Rectangle 矩形
 */

public class Rectangle extends Shape {
    private static final String TAG = "Rectangle";

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        LogUtil.i(TAG, "Inside Rectangle::draw() method.");
    }
}
