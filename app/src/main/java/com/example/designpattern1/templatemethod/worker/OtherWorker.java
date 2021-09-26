package com.example.designpattern1.templatemethod.worker;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 一些自由人员
 */

public class OtherWorker extends BaseWorker {
    private static final String TAG = "OtherWorker";

    public OtherWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        LogUtil.i(TAG, name + ",打LOL...");
    }
}
