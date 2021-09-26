package com.example.designpattern1.mediator;

import com.example.designpattern1.app.LogUtil;

import java.util.Date;

/**
 * Created by test on 2020-02-02.
 * 1. 创建中介类。
 */

public class CharRoom {
    private static final String TAG = "CharRoom";

    public static void showMessage(User user, String message) {
        LogUtil.i(TAG, new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
