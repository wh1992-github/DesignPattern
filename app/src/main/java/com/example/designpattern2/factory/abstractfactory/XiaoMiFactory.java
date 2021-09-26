package com.example.designpattern2.factory.abstractfactory;


import com.example.designpattern2.factory.Computer;
import com.example.designpattern2.factory.MiComputer;

/**
 * Created by test on 2019/1/25.
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new MiComputer();
    }

    @Override
    public MobilePhoto makeMobilePhoto() {
        return new MiPhoto();
    }
}
