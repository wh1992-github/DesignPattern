package com.example.designpattern1.interpreter.expressionimpl;

import com.example.designpattern1.interpreter.Expression;

/**
 * Created by test on 2020-02-02.
 * 2. 创建实现了上述接口的实体类。
 */

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String content) {
        return content.contains(data);
    }
}
