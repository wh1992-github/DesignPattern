package com.example.designpattern1.bridge;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.designpattern.R;
import com.example.designpattern.databinding.ActivityBridgeBinding;
import com.example.designpattern1.app.Constants;
import com.example.designpattern1.app.EMTagHandler;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * <p>
 * 这种模式涉及到一个作为桥接的接口[DrawAPI]，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
 */

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBridgeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_bridge);
        setTitle("桥接模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(Constants.BRIDGE_DEFINE));

        binding.btRed.setOnClickListener(v -> {
            //画红圆
            Circle circle = new Circle(10, 10, 100, new RedCircle());
            circle.draw();
        });

        binding.btGreen.setOnClickListener(v -> {
            //画绿圆
            Circle circle = new Circle(20, 20, 100, new GreenCircle());
            circle.draw();
        });
    }

}
