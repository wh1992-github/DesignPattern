package com.example.jingbin.designpattern.factory.cxgc;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/10/22.
 */

public abstract class RoujiaMo {
    private static final String TAG = "RoujiaMo";

    protected String name;

    /**
     * 准备工作
     */
    public void prepare(RouJiaMoYLFactory roujiaMoYLFactory) {
        Meet meet = roujiaMoYLFactory.createMeet();
        YuanLiao yuanLiao = roujiaMoYLFactory.createYuanLiao();

        LogUtil.i(TAG, "使用官方的原料 ---" + name + ": 揉面-剁肉-完成准备工作 yuanLiao:" + meet + "yuanLiao:" + yuanLiao);
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        LogUtil.i(TAG, name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        LogUtil.i(TAG, name + ": 肉夹馍-专用袋-包装---end");
    }
}
