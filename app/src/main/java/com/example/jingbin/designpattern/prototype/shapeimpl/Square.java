package com.example.jingbin.designpattern.prototype.shapeimpl;

import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.prototype.Shape;

/**
 * Created by test on 2020-01-31.
 * 2. 创建扩展了上面抽象类的实体类。Square 正方形
 */

public class Square extends Shape {
    private static final String TAG = "Square";

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        LogUtil.i(TAG, "Inside Square::draw() method.");
    }
}
