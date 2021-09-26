package com.example.designpattern1.observer.custom;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/21.
 * 模拟第一个使用者
 */

public class CustomObserver1 implements Observer {
    private static final String TAG = "ObserverUser1";

    @Override
    public void update(String msg) {
        LogUtil.i(TAG, "update: msg = " + msg);
    }
}
