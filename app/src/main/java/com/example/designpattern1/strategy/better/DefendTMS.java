package com.example.designpattern1.strategy.better;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 */

public class DefendTMS implements IDefendBehavior {
    private static final String TAG = "DefendTMS";

    @Override
    public void defend() {
        LogUtil.i(TAG, "铁布衫");
    }
}
