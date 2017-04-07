package com.hrishikesh.dp.strategypattern.behaviors.impl;

import com.hrishikesh.dp.strategypattern.behaviors.FlyBehavior;

/**
 * <p>
 *
 * </p>
 * Created by hrishikesh.mishra
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
