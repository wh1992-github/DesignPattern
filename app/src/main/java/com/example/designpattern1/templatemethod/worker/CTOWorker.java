package com.example.designpattern1.templatemethod.worker;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * CTO
 */

public class CTOWorker extends BaseWorker {
    private static final String TAG = "CTOWorker";

    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        LogUtil.i(TAG, name + ", 开会 - 出API - 检查进度");
    }
}
