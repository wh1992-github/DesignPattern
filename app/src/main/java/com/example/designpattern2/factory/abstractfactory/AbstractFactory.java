package com.example.designpattern2.factory.abstractfactory;


import com.example.designpattern2.factory.Computer;

/**
 * Created by test on 2019/1/25.
 * <p>
 * 抽象工厂模式，基于不同厂商不同产品线维度来考虑，例如一个厂商除了生产电脑，还生产手机，还有可能生产手表。。。
 */
public interface AbstractFactory {
    Computer makeComputer();

    MobilePhoto makeMobilePhoto();
}
