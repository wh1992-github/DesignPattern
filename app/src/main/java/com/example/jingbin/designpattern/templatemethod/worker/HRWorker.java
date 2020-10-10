package com.example.jingbin.designpattern.templatemethod.worker;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * HR
 */

public class HRWorker extends BaseWorker {
    private static final String TAG = "HRWorker";

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        LogUtil.i(TAG, name + ", 看简历 - 打电话 - 接电话");
    }
}
