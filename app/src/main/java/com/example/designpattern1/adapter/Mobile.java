package com.example.designpattern1.adapter;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 * 手机
 */

public class Mobile {
    private static final String TAG = "Mobile";

    //这里传入的是 v5接口,实现了这个接口的类也可以传入
    public void inputPower(V5Power v5Power) {
        int provideV5Power = v5Power.provideV5Power();
        LogUtil.i(TAG, "手机(客户端): 我需要的是5V电压充电,现在是" + provideV5Power + "V");
    }
}
