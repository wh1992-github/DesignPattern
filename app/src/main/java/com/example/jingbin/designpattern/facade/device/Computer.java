package com.example.jingbin.designpattern.facade.device;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 */

public class Computer {
    private static final String TAG = "Computer";

    public void on() {
        LogUtil.i(TAG, "打开电脑");
    }

    public void off() {
        LogUtil.i(TAG, "关闭电脑");
    }
}
