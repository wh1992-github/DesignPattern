package com.example.jingbin.designpattern.factory.gcff;

import com.example.jingbin.designpattern.factory.jdgc.RoujiaMo;

/**
 * Created by test on 2016/10/24.
 * 西安肉夹馍店: 让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoFactory factory;

    public XianRoujiaMoStore(XianSimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.createRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
