package com.example.designpattern1.singleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.designpattern.R;
import com.example.designpattern1.app.Constants;
import com.example.designpattern1.app.EMTagHandler;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingletonActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_ehan)
    Button btEhan;
    @BindView(R.id.bt_lanhan)
    Button btLanhan;
    @BindView(R.id.bt_inclass)
    Button btInclass;
    @BindView(R.id.bt_enum)
    Button btEnum;
    @BindView(R.id.tv_define)
    TextView tvDefine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
        setTitle("单例设计模式");

        tvDefine.setText(EMTagHandler.fromHtml(Constants.SINGLETON_DEFINE));
        btEhan.setOnClickListener(this);
        btLanhan.setOnClickListener(this);
        btInclass.setOnClickListener(this);
        btEnum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_ehan://饿汉式[可用]
                SingletonEHan instance = SingletonEHan.getInstance();
                break;
            case R.id.bt_lanhan://懒汉式[双重校验锁 推荐用]
                SingletonLanHan singletonLanHanFour = SingletonLanHan.getSingletonLanHanFour();
                break;
            case R.id.bt_inclass://内部类[推荐用]
                SingletonInner singletonInner = SingletonInner.getSingletonIn();
                break;
            case R.id.bt_enum://枚举[推荐用]
                SingletonEnum.instance.whateverMethod();
                break;
            default:
                break;
        }
    }
}
