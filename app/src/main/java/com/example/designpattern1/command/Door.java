package com.example.designpattern1.command;

import com.example.designpattern1.app.LogUtil;

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
