package com.example.jingbin.designpattern.visitor.impl;

import com.example.jingbin.designpattern.visitor.ComputerPart;
import com.example.jingbin.designpattern.visitor.ComputerPartVisitor;

/**
 * Created by test on 2020-02-04.
 */

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
