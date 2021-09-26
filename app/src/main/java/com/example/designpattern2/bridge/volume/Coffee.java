package com.example.designpattern2.bridge.volume;

import com.example.designpattern2.bridge.additives.ICoffeeAdditives;

public abstract class Coffee {
    protected ICoffeeAdditives additives;

    public Coffee(ICoffeeAdditives additives) {
        this.additives = additives;
    }

    public abstract void orderCoffee(int count);
}
