package com.example.designpattern1.prototype.shapeimpl;

import com.example.designpattern1.app.LogUtil;
import com.example.designpattern1.prototype.Shape;

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
