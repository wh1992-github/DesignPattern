package com.example.designpattern1.decorator.gem;

import com.example.designpattern1.decorator.IEquip;

/**
 * Created by test on 2016/11/1.
 * 黄宝石装饰品
 * 每颗攻击力: +10
 * 这与武器等不同,它是可以累加的,而武器不能
 */

public class YellowGemDecorator implements IEuipDecorator {

    private IEquip iEquip;

    public YellowGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int calculateAttack() {
        return 10 + iEquip.calculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + " + 黄宝石";
    }
}
