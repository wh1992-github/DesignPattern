package com.example.jingbin.designpattern.proxy;

import com.example.jingbin.designpattern.app.LogUtil;

/**
 * Created by test on 2020-02-01.
 * 2. 创建实现接口的实体类。
 */

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        LogUtil.i("RealImage", "loading " + fileName);
    }

    @Override
    public void display() {
        LogUtil.i("RealImage", "Displaying " + fileName);
    }
}
