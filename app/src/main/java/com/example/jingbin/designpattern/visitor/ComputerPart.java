package com.example.jingbin.designpattern.visitor;

/**
 * Created by test on 2020-02-04.
 * 1. 定义一个表示元素的接口。
 */

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
