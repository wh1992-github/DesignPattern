package com.example.designpattern1.interpreter.expressionimpl;

import com.example.designpattern1.interpreter.Expression;

/**
 * Created by test on 2020-02-02.
 * 2. 创建实现了上述接口的实体类。
 */

public class AndExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String content) {
        return expression1.interpreter(content) && expression2.interpreter(content);
    }
}
