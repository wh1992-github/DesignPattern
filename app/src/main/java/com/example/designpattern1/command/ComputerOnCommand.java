package com.example.designpattern1.command;

/**
 * Created by test on 2016/10/31.
 * 打开电脑的命令
 */

public class ComputerOnCommand implements Command {

    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
