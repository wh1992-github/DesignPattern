package com.example.jingbin.designpattern.observer.system;

import java.util.Observable;

/**
 * Created by test on 2016/10/21.
 */

public class SubjectForSSW extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 更新主题消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
