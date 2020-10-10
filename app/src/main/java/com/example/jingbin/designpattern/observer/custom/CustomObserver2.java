package com.example.jingbin.designpattern.observer.custom;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/10/21.
 * 模拟第二个使用者
 */

public class CustomObserver2 implements Observer {
    private static final String TAG = "ObserverUser2";

    @Override
    public void update(String msg) {
        LogUtil.i(TAG, "update: msg = " + msg);
    }
}
