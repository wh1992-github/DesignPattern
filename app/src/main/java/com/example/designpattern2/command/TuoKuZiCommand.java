package com.example.designpattern2.command;

public class TuoKuZiCommand implements Command {
    private FanBingBingReceiver bingBing;

    public TuoKuZiCommand(FanBingBingReceiver bingBing) {
        this.bingBing = bingBing;
    }

    @Override
    public void execute() {
        bingBing.tackOffPants();
    }
}
