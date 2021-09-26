package com.example.designpattern1.state.better;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 每个状态的实现
 * 没钱的状态
 */

public class NoMoneyState implements State {
    private static final String TAG = "NoMoneyState";

    private VendingMachineBetter machineBetter;

    public NoMoneyState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        LogUtil.i(TAG, "投币成功");
        machineBetter.setState(machineBetter.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        LogUtil.i(TAG, "您没投币就像退钱? 您这算抢!");
    }

    @Override
    public void turnCrank() {
        LogUtil.i(TAG, "您未投币就想摇杆,您在逗我吧!");
    }

    @Override
    public void dispense() {
        LogUtil.i(TAG, "这商品要是出了,我跟你姓");
        throw new IllegalStateException("非法状态");
    }
}
