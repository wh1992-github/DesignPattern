package com.example.jingbin.designpattern.state.better;

import com.example.jingbin.designpattern.app.LogUtil;

import java.util.Random;

/**
 * Created by test on 2016/11/2.
 * 已投入钱的状态
 */

public class HasMoneyState implements State {
    private static final String TAG = "HasMoneyState";

    private VendingMachineBetter machineBetter;
    Random random = new Random();

    public HasMoneyState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        LogUtil.i(TAG, "您已经投过币了,不用再投了");
    }

    @Override
    public void backMoney() {
        LogUtil.i(TAG, "退币成功");
        machineBetter.setState(machineBetter.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        LogUtil.i(TAG, "你转动了手柄...");
        int winner = random.nextInt(10);
        if (winner == 0 && machineBetter.getCount() > 1) {
            machineBetter.setState(machineBetter.getWinnerState());
        } else {
            machineBetter.setState(machineBetter.getSoldState());
        }

    }

    @Override
    public void dispense() {
        LogUtil.i(TAG, "只有在 售出商品状态时才能出货!");
        throw new IllegalStateException("非法状态!");
    }
}