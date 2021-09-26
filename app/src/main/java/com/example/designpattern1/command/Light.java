package com.example.designpattern1.command;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/31.
 * 电灯
 */

public class Light {
    private static final String TAG = "Light";

    public void on() {
        LogUtil.i(TAG, "打开灯");
    }

    public void off() {
        LogUtil.i(TAG, "关闭灯");
    }
}
