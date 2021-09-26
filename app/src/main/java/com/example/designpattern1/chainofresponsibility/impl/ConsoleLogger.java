package com.example.designpattern1.chainofresponsibility.impl;

import com.example.designpattern1.app.LogUtil;
import com.example.designpattern1.chainofresponsibility.AbstractLogger;

/**
 * Created by test on 2020-02-03.
 * 2. 创建扩展了该记录器类的实体类。
 */

public class ConsoleLogger extends AbstractLogger {
    private static final String TAG = "ConsoleLogger";

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.i(TAG, "Standard Console::Logger  " + message);
    }
}
