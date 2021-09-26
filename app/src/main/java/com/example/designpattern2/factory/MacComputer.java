package com.example.designpattern2.factory;

/**
 * Created by test on 2019/1/25.
 */
public class MacComputer extends Computer {
    @Override
    public void setOperationSystem() {
        System.out.println("Mac笔记本安装Mac系统");
    }
}
