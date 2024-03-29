package com.example.designpattern1.state.better;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 售罄的状态
 */

public class SoldOutState implements State {
    private static final String TAG = "SoldOutState";

    private VendingMachineBetter machineBetter;

    public SoldOutState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        LogUtil.i(TAG, "投币失败,商品已售罄...");
    }

    @Override
    public void backMoney() {
        LogUtil.i(TAG, "您未投币,想退钱么?");
    }

    @Override
    public void turnCrank() {
        LogUtil.i(TAG, "商品售罄，转动手柄也木有用...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态!");
    }
}
