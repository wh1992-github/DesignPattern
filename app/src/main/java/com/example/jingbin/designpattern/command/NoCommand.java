package com.example.jingbin.designpattern.command;

import com.example.jingbin.designpattern.app.LogUtil;

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
