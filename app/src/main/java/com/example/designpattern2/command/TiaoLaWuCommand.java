package com.example.designpattern2.command;

public class TiaoLaWuCommand implements Command {
    private YangMiReceiver daMiMi;
    private String duration;//跳舞的时长

    public TiaoLaWuCommand(YangMiReceiver daMiMi, String duration) {
        this.daMiMi = daMiMi;
        this.duration = duration;
    }

    @Override
    public void execute() {
        System.out.println(String.format("开始跳舞表演，时长为：%s", duration));
        daMiMi.hotDance();
    }
}
