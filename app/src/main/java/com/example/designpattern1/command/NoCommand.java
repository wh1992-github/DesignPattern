package com.example.designpattern1.command;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/31.
 * 避免=null的情况
 */

public class NoCommand implements Command {
    private static final String TAG = "NoCommand";

    @Override
    public void execute() {
        LogUtil.i(TAG, "execute: 这个命令无效!");
    }
}
