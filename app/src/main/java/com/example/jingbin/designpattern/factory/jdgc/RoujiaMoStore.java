package com.example.jingbin.designpattern.factory.jdgc;

/**
 * Created by test on 2016/10/22.
 * 简单工厂模式
 */

public class RoujiaMoStore {

    private SimpleRoujiaMoFactory factory;

    public RoujiaMoStore(SimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    public RoujiaMo sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.createRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
