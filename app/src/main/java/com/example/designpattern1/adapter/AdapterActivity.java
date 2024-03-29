package com.example.designpattern1.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.designpattern.R;
import com.example.designpattern1.app.Constants;
import com.example.designpattern1.app.EMTagHandler;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 适配器模式:
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
 * 如题目，手机充电器一般都是5V左右吧，咱天朝的家用交流电压220V，所以手机充电需要一个适配器（降压器）
 */

public class AdapterActivity extends AppCompatActivity {

    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.bt_adapter_text)
    Button btAdapterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        ButterKnife.bind(this);
        setTitle("适配器模式");
        tvDefine.setText(EMTagHandler.fromHtml(Constants.ADAPTER_DEFINE));
        btAdapterText.setText("将220V家用电转换为5V");

        btAdapterText.setOnClickListener(v -> {
            //给手机充电
            Mobile mobile = new Mobile();
            V5Power v5Power = new V5PowerAdapter(new V220Power());
            mobile.inputPower(v5Power);
        });
    }
}
