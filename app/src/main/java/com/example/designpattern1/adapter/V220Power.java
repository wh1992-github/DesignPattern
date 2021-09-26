package com.example.designpattern1.adapter;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 * 我们拥有的家用电是220v
 */

public class V220Power {
    private static final String TAG = "V220Power";

    public int provideV220Power() {
        LogUtil.i(TAG, "现有类: 我们提供的是220v的家用电");
        return 220;
    }
}
