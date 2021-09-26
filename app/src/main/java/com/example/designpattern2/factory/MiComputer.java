package com.example.designpattern2.factory;

/**
 * Created by test on 2019/1/25.
 */
public class MiComputer extends Computer {
    @Override
    public void setOperationSystem() {
        System.out.println("小米笔记本安装Win10系统");
    }
}
