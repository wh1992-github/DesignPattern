package com.example.designpattern2.builder.traditionversion;

/**
 * Created by test on 2019/1/24.
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();

    public abstract void setKeyboard();

    public abstract void setDisplay();

    public abstract Computer getComputer();
}
