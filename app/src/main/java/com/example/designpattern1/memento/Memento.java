package com.example.designpattern1.memento;

/**
 * Created by test on 2020-02-02.
 * 1. 创建 Memento 类。备忘录
 */

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
