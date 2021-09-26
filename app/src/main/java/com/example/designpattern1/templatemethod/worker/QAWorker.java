package com.example.designpattern1.templatemethod.worker;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 测试人员
 */

public class QAWorker extends BaseWorker {
    private static final String TAG = "QAWorker";

    public QAWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        LogUtil.i(TAG, name + ", 写测试用例 - 提交Bug - 复查Bug");
    }
}
