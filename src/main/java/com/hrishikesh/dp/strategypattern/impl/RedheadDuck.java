package com.hrishikesh.dp.strategypattern.impl;

import com.hrishikesh.dp.strategypattern.Duck;
import com.hrishikesh.dp.strategypattern.behaviors.impl.FlyWithWings;
import com.hrishikesh.dp.strategypattern.behaviors.impl.Squeak;

/**
 * Created by hrishikesh.mishra
 */
public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Red Head Duck");
    }
}
