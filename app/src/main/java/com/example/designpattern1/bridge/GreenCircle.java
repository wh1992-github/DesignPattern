package com.example.designpattern1.bridge;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2020-02-01.
 */

public class GreenCircle implements DrawAPI {
    private static final String TAG = "GreenCircle";

    @Override
    public void drawCircle(int radius, int x, int y) {
        LogUtil.i(TAG, "drawCircle: [Color: green, radius: "
                + radius + ", x = " + x + ", y = " + y + "]");
    }
}
