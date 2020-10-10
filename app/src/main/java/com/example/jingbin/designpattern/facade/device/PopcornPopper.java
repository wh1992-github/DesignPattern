package com.example.jingbin.designpattern.facade.device;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 爆米花机
 */

public class PopcornPopper {
    private static final String TAG = "PopcornPopper";

    public void on() {
        LogUtil.i(TAG, "打开爆米花机");
    }

    public void makePopcorn() {
        LogUtil.i(TAG, "制作爆米花");
    }

    public void off() {
        LogUtil.i(TAG, "关闭爆米花机");
    }
}
