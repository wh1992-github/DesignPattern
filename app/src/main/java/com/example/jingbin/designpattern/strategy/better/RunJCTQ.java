package com.example.jingbin.designpattern.strategy.better;

import com.example.jingbin.designpattern.app.LogUtil;

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
