package com.example.designpattern2.factory.simplefactory;


import com.example.designpattern2.factory.Computer;
import com.example.designpattern2.factory.MacComputer;
import com.example.designpattern2.factory.MiComputer;

/**
 * Created by test on 2019/1/25.
 * 增加新的产品需要修改此工厂类，违反开闭原则，降低内聚性
 */
public class SimpleComputerFactory {
    public static Computer makeComputer(String brand) {
        Computer computer = null;
        switch (brand) {
            case "mac":
                computer = new MacComputer();
                break;
            case "mi":
                computer = new MiComputer();
                break;
            default:
                break;
        }
        return computer;
    }
}
