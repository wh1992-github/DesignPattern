package com.example.jingbin.designpattern.facade.device;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 灯光
 */

public class Light {
    private static final String TAG = "Light";

    public void down() {
        LogUtil.i(TAG, "将灯光调暗");
    }

    public void up() {
        LogUtil.i(TAG, "将灯光调亮");
    }
}
