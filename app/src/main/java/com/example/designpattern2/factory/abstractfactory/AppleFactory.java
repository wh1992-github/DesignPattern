package com.example.designpattern2.factory.abstractfactory;


import com.example.designpattern2.factory.Computer;
import com.example.designpattern2.factory.MacComputer;

/**
 * Created by test on 2019/1/25.
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }

    @Override
    public MobilePhoto makeMobilePhoto() {
        return new IPhoto();
    }
}
