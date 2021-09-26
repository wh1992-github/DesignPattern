package com.example.designpattern1.visitor.impl;

import com.example.designpattern1.visitor.ComputerPart;
import com.example.designpattern1.visitor.ComputerPartVisitor;

/**
 * Created by test on 2020-02-04.
 */

public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
