package com.example.designpattern1.state;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.designpattern.R;
import com.example.designpattern1.app.Constants;
import com.example.designpattern1.app.EMTagHandler;
import com.example.designpattern1.state.better.VendingMachineBetter;
import com.example.designpattern1.state.old.VendingMachine;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 状态模式
 * 定义：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
 * 定义又开始模糊了，理一下，当对象的内部状态改变时，它的行为跟随状态的改变而改变了，看起来好像重新初始化了一个类似的。
 */

public class StateActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.bt_facade_old)
    Button btFacadeOld;
    @BindView(R.id.bt_facade_better)
    Button btFacadeBetter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        ButterKnife.bind(this);
        setTitle("状态模式");

        tvDefine.setText(EMTagHandler.fromHtml(Constants.STATE_DEFINE));
        btFacadeOld.setText("最初实现待改进");
        btFacadeBetter.setText("改进过的售货机");

        btFacadeOld.setOnClickListener(this);
        btFacadeBetter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_facade_old://最初实现待改进
                //初始化售货机,且里面有3个商品
                VendingMachine vendingMachine = new VendingMachine(3);
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();

                vendingMachine.insertMoney();
                vendingMachine.insertMoney();
                vendingMachine.turnCrank();
                vendingMachine.turnCrank();
                vendingMachine.backMoney();
                vendingMachine.turnCrank();
                break;

            case R.id.bt_facade_better://改进过的售货机
                VendingMachineBetter machineBetter = new VendingMachineBetter(4);
                //machineBetter.dispense();无法直接操作 出商品(出商品是自动的);
                //正常: 投币 退币 摇杆

                machineBetter.insertMoney();
                machineBetter.turnCrank();
                machineBetter.insertMoney();
                machineBetter.turnCrank();
                machineBetter.insertMoney();
                machineBetter.turnCrank();
                machineBetter.insertMoney();
                machineBetter.turnCrank();

                machineBetter.insertMoney();
                machineBetter.insertMoney();
                machineBetter.insertMoney();
                machineBetter.backMoney();
                machineBetter.backMoney();
                machineBetter.backMoney();
                machineBetter.turnCrank();
                machineBetter.turnCrank();
                machineBetter.turnCrank();
                break;
            default:
                break;
        }
    }
}
