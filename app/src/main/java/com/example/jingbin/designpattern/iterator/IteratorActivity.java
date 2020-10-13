package com.example.jingbin.designpattern.iterator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.Constants;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.app.LogUtil;
import com.example.jingbin.designpattern.databinding.ActivityIteratorBinding;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * <p>
 * 主要解决：不同的方式来遍历整个整合对象。
 */

public class IteratorActivity extends AppCompatActivity {
    private static final String TAG = "IteratorActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIteratorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_iterator);
        setTitle("迭代器模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(Constants.ITERATOR_DEFINE));

        binding.btPlName.setOnClickListener(v -> {
            //3. 使用 NameRepository 来获取迭代器，并打印名字。
            NameIterator nameIterator = new NameIterator();
            Iterator iterator = nameIterator.getIterator();
            while (iterator.hasNext()) {
                LogUtil.i(TAG, "name = " + iterator.next());
            }
        });
    }
}
