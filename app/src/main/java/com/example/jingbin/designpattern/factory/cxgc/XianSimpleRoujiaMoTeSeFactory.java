package com.example.jingbin.designpattern.factory.cxgc;

/**
 * Created by test on 2016/10/23.
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */

public class XianSimpleRoujiaMoTeSeFactory {

    public RoujiaMo createRoujiaMo(String type) {
        RoujiaMo roujiaMo;
        switch (type) {
            case "Suan":
                roujiaMo = new XianSuanRoujiaMo();
                break;
            case "La":
                roujiaMo = new XianKuRoujiaMo();
                break;
            case "Tian":
                roujiaMo = new XianLaRoujiaMo();
                break;
            default://默认为酸肉夹馍
                roujiaMo = new XianSuanRoujiaMo();
                break;
        }
        return roujiaMo;
    }
}
