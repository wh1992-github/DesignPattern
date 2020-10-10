package com.example.jingbin.designpattern.visitor;

import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.visitor.impl.Computer;
import com.example.jingbin.designpattern.visitor.impl.Keyboard;
import com.example.jingbin.designpattern.visitor.impl.Monitor;
import com.example.jingbin.designpattern.visitor.impl.Mouse;

/**
 * Created by test on 2020-02-04.
 * 4. 创建实现了 ComputerPartVisitor 的实体访问者。
 */

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    private static final String TAG = "ComputerPartDisplayVisi";

    @Override
    public void visit(Computer computer) {
        LogUtil.i(TAG, "Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        LogUtil.i(TAG, "Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        LogUtil.i(TAG, "Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        LogUtil.i(TAG, "Displaying Monitor.");
    }
}
