package com.example.designpattern1.factory.cxgc;

/**
 * Created by test on 2016/10/26.
 * 4、抽象工厂模式:
 * 定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
 * 这定义有点绕口，算了，还是拿例子来说。
 * 继续卖肉夹馍，咱们生意这么好，难免有些分店开始动歪脑子，开始使用劣质肉等，砸我们的品牌。
 * 所以我们要拿钱在每个城市建立自己的原料场，保证高质量原料的供应。
 */

public interface RouJiaMoYLFactory {

    /**
     * 生产肉
     */
    Meet createMeet();

    /**
     * 生产一些原料
     */
    YuanLiao createYuanLiao();
}
