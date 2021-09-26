package com.example.designpattern1.visitor.impl;

import com.example.designpattern1.visitor.ComputerPart;
import com.example.designpattern1.visitor.ComputerPartVisitor;

/**
 * Created by test on 2020-02-04.
 */

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
