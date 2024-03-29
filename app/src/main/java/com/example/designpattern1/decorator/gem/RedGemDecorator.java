package com.example.designpattern1.decorator.gem;

import com.example.designpattern1.decorator.IEquip;

/**
 * Created by test on 2016/11/1.
 * 红宝石装饰品
 * 每颗攻击力: +15
 * 这与武器等不同,它是可以累加的,而武器不能
 */

public class RedGemDecorator implements IEuipDecorator {

    private IEquip iEquip;

    public RedGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int calculateAttack() {
        return 15 + iEquip.calculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + " + 红宝石";
    }
}
