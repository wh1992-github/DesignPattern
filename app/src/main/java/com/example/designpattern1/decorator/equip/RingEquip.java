package com.example.designpattern1.decorator.equip;

import com.example.designpattern1.decorator.IEquip;

/**
 * Created by test on 2016/11/1.
 * 戒指
 * 攻击力 5
 */

public class RingEquip implements IEquip {

    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
