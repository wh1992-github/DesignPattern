package com.example.designpattern1.iterator;

import com.example.designpattern1.app.LogUtil;

/**
 * Created by test on 2020-02-02.
 * 2. 创建实现了 Iterator 接口的实体类。
 */

public class NameIterator implements CustomIterator {
    private static final String TAG = "NameIterator";
    private static final String[] names = {"John", "jingbin", "youlookwhat", "lookthis"};
    private int index = 0;

    public static NameIterator getIterator() {
        return new NameIterator();
    }

    @Override
    public boolean hasNext() {
        return names.length > index;
    }

    @Override
    public String next() {
        return names[index++];
    }


    public void printName() {
        while (hasNext()) {
            LogUtil.i(TAG, "printName: name = " + next());
        }

    }
}
