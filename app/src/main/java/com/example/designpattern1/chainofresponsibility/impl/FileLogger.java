package com.example.designpattern1.chainofresponsibility.impl;

import com.example.designpattern1.app.LogUtil;
import com.example.designpattern1.chainofresponsibility.AbstractLogger;

/**
 * Created by test on 2020-02-03.
 */

public class FileLogger extends AbstractLogger {
    private static final String TAG = "FileLogger";

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        LogUtil.i(TAG, "File::Logger  " + message);
    }
}
