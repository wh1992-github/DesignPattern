package com.example.designpattern1.bridge;

/**
 * Created by test on 2020-02-01.
 * 4. 创建实现了 Shape 接口的实体类。
 */

public class Circle extends Shape {

    private int x, y, radius;

    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
