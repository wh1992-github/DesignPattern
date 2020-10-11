package com.example.jingbin.designpattern.interpreter;

/**
 * Created by test on 2020-02-02.
 * 1. 创建一个表达式接口。
 */

public interface Expression {
    boolean interpreter(String content);
}
