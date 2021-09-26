package com.example.designpattern1.strategy.old;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2016/10/30.
 */

public class RoleB extends Role {
    private static final String TAG = "RoleB";

    public RoleB(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        LogUtil.i(TAG, "样子2");
    }

    @Override
    protected void run() {
        LogUtil.i(TAG, "金蝉脱壳");//拷贝,显得冗余
    }

    @Override
    protected void attack() {
        LogUtil.i(TAG, "降龙十八掌");//拷贝,显得冗余
    }

    @Override
    protected void defend() {
        LogUtil.i(TAG, "铁布衫");
    }
}
