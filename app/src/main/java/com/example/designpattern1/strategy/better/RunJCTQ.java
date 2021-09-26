package com.example.designpattern1.strategy.better;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 */

public class RunJCTQ implements IRunBehavior {
    private static final String TAG = "RunJCTQ";

    @Override
    public void run() {
        LogUtil.i(TAG, "金蝉脱壳");
    }
}
