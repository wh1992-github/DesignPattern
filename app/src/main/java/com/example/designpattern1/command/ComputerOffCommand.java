package com.example.designpattern1.command;

/**
 * Created by test on 2016/10/31.
 * 关闭电脑的命令
 */

public class ComputerOffCommand implements Command {

    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
