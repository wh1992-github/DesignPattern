package com.example.designpattern1.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 2020-02-02.
 * 3. 创建 CareTaker 类。 管理员
 */

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
