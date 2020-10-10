package com.example.jingbin.designpattern.state.old;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 自动售货机
 * 分析一个这个状态图：
 * a、包含4个状态（我们使用4个int型常量来表示）
 * b、包含3个暴露在外的方法（投币、退币、转动手柄）
 * c、我们需要处理每个状态下，用户都可以触发这三个动作。
 */

public class VendingMachine {
    private static final String TAG = "VendingMachine";
    /**
     * 已投币
     */
    private final static int HAS_MONEY = 0;
    /**
     * 未投币
     */
    private final static int NO_MONEY = 1;
    /**
     * 售出商品
     */
    private final static int SOLD = 2;
    /**
     * 商品售罄
     */
    private final static int SOLD_OUT = 3;

    private int currentStatus = NO_MONEY;
    /**
     * 商品数量
     */
    private int count = 0;


    public VendingMachine(int count) {
        this.count = count;
        if (count > 0) {
            currentStatus = NO_MONEY;
        }
    }

    /**
     * 投入硬币,任何状态用户都可能投币
     */
    public void insertMoney() {
        switch (currentStatus) {
            case NO_MONEY://未投币
                currentStatus = HAS_MONEY;
                LogUtil.i(TAG, "成功投入硬币");
                break;
            case HAS_MONEY://已投币
                LogUtil.i(TAG, "已经有硬币,无需投币");
                break;
            case SOLD://售出商品
                LogUtil.i(TAG, "请稍等...");
                break;
            case SOLD_OUT://商品售罄
                LogUtil.i(TAG, "商品已经售罄, 请勿投币");
                break;
        }
    }

    /**
     * 退币,任何状态用户都可能退币
     */
    public void backMoney() {
        switch (currentStatus) {
            case NO_MONEY://未投币
                LogUtil.i(TAG, "您未投入硬币");
                break;
            case HAS_MONEY://已投币
                currentStatus = NO_MONEY;
                LogUtil.i(TAG, "退币成功");
                break;
            case SOLD://售出商品
                LogUtil.i(TAG, "您已经买了糖果...");
                break;
            case SOLD_OUT://商品售罄
                LogUtil.i(TAG, "您未投币,想坑我钱吗?");
                break;
        }
    }

    /**
     * 转动手柄购买,任何状态都有可能转动手柄
     */
    public void turnCrank() {
        switch (currentStatus) {
            case NO_MONEY://未投币
                LogUtil.i(TAG, "请先投入硬币");
                break;
            case HAS_MONEY://已投币
                LogUtil.i(TAG, "正在出商品");
                currentStatus = SOLD;
                dispense();
                break;
            case SOLD://售出商品
                LogUtil.i(TAG, "连续转动也没用...");
                break;
            case SOLD_OUT://商品售罄
                LogUtil.i(TAG, "商品已经售罄");
                break;
        }
    }

    /**
     * 发送商品
     */
    private void dispense() {
        switch (currentStatus) {
            case NO_MONEY://未投币
            case HAS_MONEY://已投币
            case SOLD_OUT://商品售罄
                throw new IllegalStateException("非法的状态...");
            case SOLD://售出商品
                count--;
                LogUtil.i(TAG, "发出商品...");
                if (count == 0) {
                    LogUtil.i(TAG, "商品售罄");
                    currentStatus = SOLD_OUT;
                } else {
                    currentStatus = NO_MONEY;
                }
                break;
        }
    }

}
