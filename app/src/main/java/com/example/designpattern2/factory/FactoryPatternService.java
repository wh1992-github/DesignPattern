package com.example.designpattern2.factory;


import com.example.designpattern2.factory.abstractfactory.AbstractFactory;
import com.example.designpattern2.factory.abstractfactory.AppleFactory;
import com.example.designpattern2.factory.factorymethod.ComputerFactory;
import com.example.designpattern2.factory.factorymethod.MacComputerFactory;
import com.example.designpattern2.factory.simplefactory.SimpleComputerFactory;

public class FactoryPatternService {

    public void makePcUseSimpleFactory() {
        Computer computer = SimpleComputerFactory.makeComputer("mi");
        computer.setOperationSystem();
    }

    public void makePcUseFactory() {
        //需要创建哪个品牌的电脑就使用对应的工厂，此处想生产Mac,所以使用了MacComputerFactory
        ComputerFactory factory = new MacComputerFactory();
        factory.makeComputer().setOperationSystem();
    }

    public void makePcUseAbstractFactory() {
        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.makeComputer().setOperationSystem();
        appleFactory.makeMobilePhoto().setOperationSystem();
    }

}
