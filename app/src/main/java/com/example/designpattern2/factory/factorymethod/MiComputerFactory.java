package com.example.designpattern2.factory.factorymethod;


import com.example.designpattern2.factory.Computer;
import com.example.designpattern2.factory.MiComputer;

/**
 * Created by test on 2019/1/25.
 */
public class MiComputerFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new MiComputer();
    }
}
