package com.example.designpattern1.decorator.equip;

import com.example.designpattern1.decorator.IEquip;

/**
 * Created by test on 2016/11/1.
 * 武器
 * 攻击力 20
 */

public class ArmEquip implements IEquip {

    @Override
    public int calculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙宝刀";
    }
}
