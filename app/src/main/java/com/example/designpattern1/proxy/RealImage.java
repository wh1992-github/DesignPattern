package com.example.designpattern1.proxy;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2020-02-01.
 * 2. 创建实现接口的实体类。
 */

public class RealImage implements Image {
    private static final String TAG = "RealImage";

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        LogUtil.i(TAG, "loadFromDisk: fileName = " + fileName);
    }

    @Override
    public void display() {
        LogUtil.i(TAG, "display: fileName = " + fileName);
    }
}
