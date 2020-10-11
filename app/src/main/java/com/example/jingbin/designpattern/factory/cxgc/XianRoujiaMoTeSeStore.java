package com.example.jingbin.designpattern.factory.cxgc;

/**
 * Created by test on 2016/10/24.
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoTeSeStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoTeSeFactory factory;

    public XianRoujiaMoTeSeStore(XianSimpleRoujiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    public RoujiaMo sellRoujiaMo(String type) {
        RoujiaMo roujiaMo = factory.createRoujiaMo(type);
        roujiaMo.prepare(new XianRouJiaMoYLFactory());
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
