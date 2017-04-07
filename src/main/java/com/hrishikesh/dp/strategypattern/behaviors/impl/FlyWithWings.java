package com.hrishikesh.dp.strategypattern.behaviors.impl;

import com.hrishikesh.dp.strategypattern.behaviors.FlyBehavior;

/**
 * <p>
 *     Fly with wings behavior
 * </p>
 * Created by hrishikesh.mishra
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
