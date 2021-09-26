package com.example.designpattern1.state.better;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 售卖状态
 */

public class SoldState implements State {
    private static final String TAG = "SoldState";

    private VendingMachineBetter machineBetter;

    public SoldState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        LogUtil.i(TAG, "正在出货,请勿投币");
    }

    @Override
    public void backMoney() {
        LogUtil.i(TAG, "正在出货,没有可退的钱");
    }

    @Override
    public void turnCrank() {
        LogUtil.i(TAG, "正在出货,请勿重复摇动手柄");
    }

    @Override
    public void dispense() {
        machineBetter.dispense();
        if (machineBetter.getCount() > 0) {
            machineBetter.setState(machineBetter.getNoMoneyState());
        } else {
            LogUtil.i(TAG, "商品已经售罄");
            machineBetter.setState(machineBetter.getSoldOutState());
        }
    }
}
