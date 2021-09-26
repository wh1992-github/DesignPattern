package com.example.designpattern1.observer.custom;

import java.util.ArrayList;

/**
 * Created by test on 2016/10/21.
 * 接下来3D服务号的实现类：
 */

public class CustomSubject implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 3D 彩票的号码
     */
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 主题更新信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
