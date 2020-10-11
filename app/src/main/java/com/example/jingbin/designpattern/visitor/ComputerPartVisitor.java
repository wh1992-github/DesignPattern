package com.example.jingbin.designpattern.visitor;

import com.example.jingbin.designpattern.visitor.impl.Computer;
import com.example.jingbin.designpattern.visitor.impl.Keyboard;
import com.example.jingbin.designpattern.visitor.impl.Monitor;
import com.example.jingbin.designpattern.visitor.impl.Mouse;

/**
 * Created by test on 2020-02-04.
 * 3. 定义一个表示访问者的接口。
 */

public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
