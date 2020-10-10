package com.example.jingbin.designpattern.strategy.better;

import com.example.jingbin.designpattern.app.LogUtil;

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
