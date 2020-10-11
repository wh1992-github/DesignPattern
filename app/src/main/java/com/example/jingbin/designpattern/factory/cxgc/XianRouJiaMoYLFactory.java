package com.example.jingbin.designpattern.factory.cxgc;

/**
 * Created by test on 2016/10/26.
 * 西安的肉夹馍原料工厂,是西安的特色原料,还有其他分店的特色原料
 */

public class XianRouJiaMoYLFactory implements RouJiaMoYLFactory {

    @Override
    public Meet createMeet() {
        return new XianFreshMeet();
    }

    @Override
    public YuanLiao createYuanLiao() {
        return new XianTeSeYuanLiao();
    }
}
