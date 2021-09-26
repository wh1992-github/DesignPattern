package com.example.designpattern1.strategy.old;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 */

public class RoleA extends Role {
    private static final String TAG = "RoleA";

    public RoleA(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        LogUtil.i(TAG, "样子1");
    }

    @Override
    protected void run() {
        LogUtil.i(TAG, "金蚕脱壳");
    }

    @Override
    protected void attack() {
        LogUtil.i(TAG, "降龙十八掌");
    }

    @Override
    protected void defend() {
        LogUtil.i(TAG, "铁头功");
    }
}
