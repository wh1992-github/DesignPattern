package com.example.designpattern2.bridge;

import com.example.designpattern2.bridge.additives.Milk;
import com.example.designpattern2.bridge.additives.Sugar;
import com.example.designpattern2.bridge.volume.LargeCoffee;
import com.example.designpattern2.bridge.volume.RefinedCoffee;
import com.example.designpattern2.bridge.volume.SmallCoffee;

/**
 * Copyright (C) 2021 ShuSheng007
 * 完全享有此软件的著作权
 *
 * @author ShuSheng007
 * @time 2021/5/1 16:50
 * @description
 */
public class BridgeClient {

    public void orderOffer() {

        //两杯加奶的大杯咖啡
        RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.checkQuality();
        System.out.println("-----------------------------------------");
        //两杯加奶的大杯咖啡
        RefinedCoffee smallWithSugar = new SmallCoffee(new Sugar());
        smallWithSugar.orderCoffee(1);
        smallWithSugar.checkQuality();
    }
}
