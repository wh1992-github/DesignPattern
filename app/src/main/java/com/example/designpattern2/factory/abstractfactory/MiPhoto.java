package com.example.designpattern2.factory.abstractfactory;

/**
 * Created by test on 2019/1/25.
 */
public class MiPhoto extends MobilePhoto {
    @Override
    public void setOperationSystem() {
        System.out.println("小米手机安装Android系统");
    }
}
