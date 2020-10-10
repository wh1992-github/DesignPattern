package com.example.jingbin.designpattern.strategy.better;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 */

public class DisplayYZ implements IDisplayBehavior {
    private static final String TAG = "DisplayYZ";

    @Override
    public void display() {
        LogUtil.i(TAG, "样子2");
    }
}
