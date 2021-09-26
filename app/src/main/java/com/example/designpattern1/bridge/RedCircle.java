package com.example.designpattern1.bridge;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2020-02-01.
 * 2. 创建实现了 DrawAPI 接口的实体桥接实现类。
 */

public class RedCircle implements DrawAPI {
    private static final String TAG = "RedCircle";

    @Override
    public void drawCircle(int radius, int x, int y) {
        LogUtil.i(TAG, "Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
