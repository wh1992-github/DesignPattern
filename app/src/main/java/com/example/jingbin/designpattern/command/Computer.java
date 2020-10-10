package com.example.jingbin.designpattern.command;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/10/31.
 * 电脑
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
