package com.example.jingbin.designpattern.iterator;

/**
 * Created by test on 2020-02-02.
 * 2. 创建实现了 Iterator 接口的实体类。
 */

public class NameIterator implements Iterator {
    private static final String[] names = {"John", "jingbin", "youlookwhat", "lookthis"};
    private int index = 0;

    public Iterator getIterator() {
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
}
