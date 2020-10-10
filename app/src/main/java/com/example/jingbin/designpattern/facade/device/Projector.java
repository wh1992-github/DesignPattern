package com.example.jingbin.designpattern.facade.device;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 投影仪
 */

public class Projector {
    private static final String TAG = "Projector";

    public void on() {
        LogUtil.i(TAG, "打开投影仪");
    }

    public void open() {
        LogUtil.i(TAG, "放下投影仪投影区");
    }

    public void off() {
        LogUtil.i(TAG, "关闭投影仪");
    }

    public void close() {
        LogUtil.i(TAG, "收起投影仪投影区");
    }
}
