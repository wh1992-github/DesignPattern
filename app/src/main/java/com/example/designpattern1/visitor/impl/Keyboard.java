package com.example.designpattern1.visitor.impl;

import com.example.designpattern1.visitor.ComputerPart;
import com.example.designpattern1.visitor.ComputerPartVisitor;

/**
 * Created by test on 2020-02-04.
 * 2. 创建扩展了上述类的实体类。
 */

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
