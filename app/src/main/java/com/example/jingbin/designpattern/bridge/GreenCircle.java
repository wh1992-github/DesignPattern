package com.example.jingbin.designpattern.bridge;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2020-02-01.
 */

public class GreenCircle implements DrawAPI {
    private static final String TAG = "GreenCircle";

    @Override
    public void drawCircle(int radius, int x, int y) {
        LogUtil.i(TAG, "Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
