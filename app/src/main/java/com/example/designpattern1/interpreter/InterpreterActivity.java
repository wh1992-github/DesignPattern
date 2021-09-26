package com.example.designpattern1.interpreter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityInterpreterBinding;
import com.example.designpattern1.app.Constants;
import com.example.designpattern1.app.EMTagHandler;
import com.example.designpattern1.app.LogUtil;
import com.example.designpattern1.interpreter.expressionimpl.AndExpression;
import com.example.designpattern1.interpreter.expressionimpl.OrExpression;
import com.example.designpattern1.interpreter.expressionimpl.TerminalExpression;

/**
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * <p>
 * 主要解决：对于一些固定文法构建一个解释句子的解释器。
 */

public class InterpreterActivity extends AppCompatActivity {
    private static final String TAG = "InterpreterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInterpreterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_interpreter);
        setTitle("解释器模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(Constants.INTERPRETER_DEFINE));

        //3. InterpreterPatternDemo 使用 Expression 类来创建规则，并解析它们
        binding.btMan.setOnClickListener(v -> {
            Expression maleExpression = getMaleExpression();
            //jingbin is male: true
            LogUtil.i(TAG, "jingbin is male: " + maleExpression.interpreter("jingbin"));
        });

        binding.btMarriedWoman.setOnClickListener(v -> {
            Expression womanExpression = getMarriedWomanExpression();
            //Julie is married woman: true
            LogUtil.i(TAG, "Julie is married woman: " + womanExpression.interpreter("Married Julie"));
        });
    }

    /**
     * 规则：jingbin 和 youlookwhat 是男性
     */
    public static Expression getMaleExpression() {
        TerminalExpression jingbin = new TerminalExpression("jingbin");
        TerminalExpression youlookwhat = new TerminalExpression("youlookwhat");
        return new OrExpression(jingbin, youlookwhat);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     */
    public static Expression getMarriedWomanExpression() {
        TerminalExpression julie = new TerminalExpression("Julie");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
