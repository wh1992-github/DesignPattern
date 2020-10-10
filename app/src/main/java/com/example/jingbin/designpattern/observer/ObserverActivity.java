package com.example.jingbin.designpattern.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.Constants;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.observer.custom.CustomObserver1;
import com.example.jingbin.designpattern.observer.custom.CustomObserver2;
import com.example.jingbin.designpattern.observer.custom.CustomSubject;
import com.example.jingbin.designpattern.observer.system.SubjectForSSQ;
import com.example.jingbin.designpattern.observer.system.SubjectForSSW;
import com.example.jingbin.designpattern.observer.system.SystemObserver1;
import com.example.jingbin.designpattern.observer.system.SystemObserver2;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 可以看出，使用Java内置的类实现观察者模式，代码非常简洁，
 * 对了addObserver,removeObserver,notifyObservers都已经为我们实现了，
 * 所有可以看出Observable（主题）是一个类，而不是一个接口，
 * 基本上书上都对于Java的如此设计抱有反面的态度，觉得Java内置的观察者模式，
 * 违法了面向接口编程这个原则，但是如果转念想一想，
 * 的确你拿一个主题在这写观察者模式（我们自己的实现），
 * 接口的思想很好，但是如果现在继续添加很多个主题，
 * 每个主题的ddObserver,removeObserver,notifyObservers代码基本都是相同的吧，
 * 接口是无法实现代码复用的，而且也没有办法使用组合的模式实现这三个方法的复用，
 * 所以我觉得这里把这三个方法在类中实现是合理的。
 */

public class ObserverActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.bt_myself)
    Button btMyself;
    @BindView(R.id.bt_system)
    Button btSystem;
    @BindView(R.id.activity_observer)
    LinearLayout activityObserver;
    //custom
    private CustomSubject mCustomSubject;
    private CustomObserver1 mCustomObserver1;
    private CustomObserver2 mCustomObserver2;
    //system
    private SubjectForSSW mSubjectForSSW;
    private SubjectForSSQ mSubjectForSSQ;
    private SystemObserver1 mSystemObserver1;
    private SystemObserver2 mSystemObserver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);
        setTitle("观察者模式");
        tvDefine.setText(EMTagHandler.fromHtml(Constants.OBSERVER_DEFINE));

        btMyself.setOnClickListener(this);
        btSystem.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_myself://自己实现的观察者模式
                loadCustomObserver();
                break;
            case R.id.bt_system://使用Java内置的类实现观察者模式
                loadSystemObserver();
                break;
            default:
                break;
        }
    }

    /**
     * 系统的观察者接口
     */
    private void loadCustomObserver() {
        //创建服务号
        mCustomSubject = new CustomSubject();
        //创建两个订阅者
        mCustomObserver1 = new CustomObserver1();
        mCustomObserver2 = new CustomObserver2();
        //添加两个订阅者
        mCustomSubject.registerObserver(mCustomObserver1);
        mCustomSubject.registerObserver(mCustomObserver2);
        //两个观察者,发送两条信息
        mCustomSubject.setMsg("20161021 的3D号为:127");
        mCustomSubject.setMsg("20161022 的3D号为:128");
    }

    /**
     * 系统的观察者接口
     */
    private void loadSystemObserver() {
        //创建2个服务号
        mSubjectForSSW = new SubjectForSSW();
        mSubjectForSSQ = new SubjectForSSQ();
        //创建订阅者
        mSystemObserver1 = new SystemObserver1();
        mSystemObserver2 = new SystemObserver2();
        //添加订阅者
        mSubjectForSSW.addObserver(mSystemObserver1);
        mSubjectForSSW.addObserver(mSystemObserver2);
        mSubjectForSSQ.addObserver(mSystemObserver1);
        mSubjectForSSQ.addObserver(mSystemObserver2);
        //发送信息
        mSubjectForSSW.setMsg("hello SSW: ");
        mSubjectForSSQ.setMsg("hello SSQ: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mCustomSubject != null) {
            mCustomSubject.removeObserver(mCustomObserver1);
            mCustomSubject.removeObserver(mCustomObserver2);
        }
        if (mSubjectForSSW != null) {
            mSubjectForSSW.deleteObserver(mSystemObserver1);
            mSubjectForSSW.deleteObserver(mSystemObserver2);
        }
        if (mSubjectForSSQ != null) {
            mSubjectForSSQ.deleteObserver(mSystemObserver1);
            mSubjectForSSQ.deleteObserver(mSystemObserver2);
        }
        mCustomSubject = null;
        mSubjectForSSW = null;
        mSubjectForSSQ = null;
    }
}
