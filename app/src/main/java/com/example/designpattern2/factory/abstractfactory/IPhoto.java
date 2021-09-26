package com.example.designpattern2.factory.abstractfactory;

/**
 * Created by test on 2019/1/25.
 */
public class IPhoto extends MobilePhoto {
    @Override
    public void setOperationSystem() {
        System.out.println("苹果手机安装IOS系统");
    }
}
