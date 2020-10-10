package com.example.jingbin.designpattern.prototype.shapeimpl;

import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.prototype.Shape;

/**
 * Created by test on 2020-01-31.
 * 2. 创建扩展了上面抽象类的实体类。Circle 圆形
 */

public class Circle extends Shape {
    private static final String TAG = "Circle";

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        LogUtil.i(TAG, "Inside Circle::draw() method.");
    }

}
