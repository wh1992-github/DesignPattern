package com.example.designpattern2.builder.traditionversion;

/**
 * Created by test on 2019/1/24.
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder) {
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
