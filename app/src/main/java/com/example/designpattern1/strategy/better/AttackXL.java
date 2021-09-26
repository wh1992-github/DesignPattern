package com.example.designpattern1.strategy.better;

import com.example.designpattern1.app.LogUtil;

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
