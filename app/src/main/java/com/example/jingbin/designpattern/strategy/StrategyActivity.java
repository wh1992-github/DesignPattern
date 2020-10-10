package com.example.jingbin.designpattern.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.Constants;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.strategy.better.AttackXL;
import com.example.jingbin.designpattern.strategy.better.DefendTMS;
import com.example.jingbin.designpattern.strategy.better.DisplayYZ;
import com.example.jingbin.designpattern.strategy.better.RoleA;
import com.example.jingbin.designpattern.strategy.better.RunJCTQ;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，
 * 让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 */

public class StrategyActivity extends AppCompatActivity {

    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.bt_strategy_text)
    Button btStrategyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);
        setTitle("策略模式");

        tvDefine.setText(EMTagHandler.fromHtml(Constants.STRATEGY_DEFINE));
        btStrategyText.setText("创建角色A,并设定样子,攻击,逃跑,防御");

        btStrategyText.setOnClickListener(v -> {
            RoleA roleA = new RoleA("---A");
            roleA.setDisplayBehavior(new DisplayYZ())
                    .setAttackBehavior(new AttackXL())
                    .setDefendBehavior(new DefendTMS())
                    .setRunBehavior(new RunJCTQ());
            roleA.display();//样子
            roleA.attack();//攻击
            roleA.run();//逃跑
            roleA.defend();//防御
        });
    }
}
