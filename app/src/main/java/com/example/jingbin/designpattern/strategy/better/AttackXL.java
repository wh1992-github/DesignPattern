package com.example.jingbin.designpattern.strategy.better;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 */

public class AttackXL implements IAttackBehavior {
    private static final String TAG = "AttackXL";

    @Override
    public void attack() {
        LogUtil.i(TAG, "降龙十八掌");
    }
}
