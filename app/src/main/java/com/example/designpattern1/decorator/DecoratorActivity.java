package com.example.designpattern1.decorator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.designpattern.R;
import com.example.designpattern1.app.Constants;
import com.example.designpattern1.app.EMTagHandler;
import com.example.designpattern1.app.LogUtil;
import com.example.designpattern1.decorator.equip.RingEquip;
import com.example.designpattern1.decorator.equip.ShoeEquip;
import com.example.designpattern1.decorator.gem.BlueGemDecorator;
import com.example.designpattern1.decorator.gem.RedGemDecorator;
import com.example.designpattern1.decorator.gem.YellowGemDecorator;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 装饰者模式:
 * 装饰者模式：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。
 * 先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，
 * 并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。
 * 这里还体现了一个原则：类应该对扩展开放，对修改关闭。
 * eg:
 * 1、武器（攻击力20） 、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）
 * 2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）
 * 3、每个装备可以随意镶嵌3颗
 */

public class DecoratorActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "DecoratorActivity";
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.bt_demo1)
    Button btDemo1;
    @BindView(R.id.bt_demo2)
    Button btDemo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        ButterKnife.bind(this);
        setTitle("装饰者模式");
        tvDefine.setText(EMTagHandler.fromHtml(Constants.DECORATOR_DEFINE));

        btDemo1.setText("一个镶嵌2颗红宝石,1颗蓝宝石的靴子");
        btDemo2.setText("一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指");

        btDemo1.setOnClickListener(this);
        btDemo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_demo1:
                LogUtil.i(TAG, "一个镶嵌2颗红宝石,1颗蓝宝石的靴子: ");
                IEquip iEquip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
                LogUtil.i(TAG, "攻击力 = " + iEquip.calculateAttack());
                LogUtil.i(TAG, "描述语 = " + iEquip.description());
                break;
            case R.id.bt_demo2:
                LogUtil.i(TAG, "一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指: ");
                RedGemDecorator redGemDecorator = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new RingEquip())));
                LogUtil.i(TAG, "攻击力 = " + redGemDecorator.calculateAttack());
                LogUtil.i(TAG, "描述语 = " + redGemDecorator.description());
                break;
            default:
                break;
        }
    }
}
