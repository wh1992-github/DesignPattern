package com.example.jingbin.designpattern.memento;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.Constants;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.databinding.ActivityMementoBinding;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 * <p>
 * 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，
 * 并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
 */

public class MementoActivity extends AppCompatActivity {
    private static final String TAG = "MementoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMementoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_memento);
        setTitle("备忘录模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(Constants.MEMENTO_DEFINE));

        //4. 使用 CareTaker 和 Originator 对象。
        binding.btUseMemento.setOnClickListener(v -> {
            //管理者
            CareTaker careTaker = new CareTaker();
            Originator originator = new Originator();
            originator.setState("State #1");
            originator.setState("State #2");
            //保存状态
            careTaker.add(originator.setSateToMemento());
            originator.setState("State #3");
            //保存状态
            careTaker.add(originator.setSateToMemento());
            originator.setState("State #4");
            LogUtil.i(TAG, "Current State: " + originator.getState());
            //得到保存的状态
            String fromMemento1 = originator.getStateFromMemento(careTaker.get(0));
            LogUtil.i(TAG, "First Saved State: " + fromMemento1);
            String fromMemento2 = originator.getStateFromMemento(careTaker.get(1));
            LogUtil.i(TAG, "Second Saved State: " + fromMemento2);
        });
    }
}
