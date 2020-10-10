package com.example.jingbin.designpattern.command;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/10/31.
 * 门
 */

public class Door {
    private static final String TAG = "Door";

    public void open() {
        LogUtil.i(TAG, "打开门");
    }

    public void close() {
        LogUtil.i(TAG, "关闭门");
    }
}
