package com.example.designpattern2.factory.factorymethod;


import com.example.designpattern2.factory.Computer;
import com.example.designpattern2.factory.MacComputer;

/**
 * Created by test on 2019/1/25.
 */
public class MacComputerFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }
}
