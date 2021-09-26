package com.example.designpattern2.factory.factorymethod;


import com.example.designpattern2.factory.Computer;

/**
 * Created by test on 2019/1/25.
 * <p>
 * 工厂方法模式，同一种产品不同品牌，例如苹果PC和小米PC，都是PC
 */
public interface ComputerFactory {
    Computer makeComputer();
}
