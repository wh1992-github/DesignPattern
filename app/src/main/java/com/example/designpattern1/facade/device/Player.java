package com.example.designpattern1.facade.device;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 播放器
 */

public class Player {
    private static final String TAG = "Player";

    public void on() {
        LogUtil.i(TAG, "打开播放器");
    }

    public void make3DListener() {
        LogUtil.i(TAG, "将播放器音调设为环绕立体声");
    }

    public void off() {
        LogUtil.i(TAG, "关闭播放器");
    }
}
