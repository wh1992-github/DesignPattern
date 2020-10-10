package com.example.jingbin.designpattern.templatemethod.worker;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2016/11/2.
 * 程序员
 */

public class ITWorker extends BaseWorker {
    private static final String TAG = "ITWorker";

    public ITWorker(String name) {
        super(name);
    }

    /**
     * 重写父类的此方法,使可以查看离开公司时间
     */
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        LogUtil.i(TAG, name + ", 写程序 - 测bug - 修复bug");
    }
}
