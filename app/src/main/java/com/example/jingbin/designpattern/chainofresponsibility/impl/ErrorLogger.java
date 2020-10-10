package com.example.jingbin.designpattern.chainofresponsibility.impl;

import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.chainofresponsibility.AbstractLogger;

/**
 * Created by test on 2020-02-03.
 */

public class ErrorLogger extends AbstractLogger {
    private static final String TAG = "ErrorLogger";

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.i(TAG, "Error Console::Logger  " + message);
    }
}
