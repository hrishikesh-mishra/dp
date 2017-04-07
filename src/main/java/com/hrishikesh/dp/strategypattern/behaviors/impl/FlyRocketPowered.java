package com.hrishikesh.dp.strategypattern.behaviors.impl;

import com.hrishikesh.dp.strategypattern.behaviors.FlyBehavior;

/**
 * Created by hrishikesh.mishra
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
