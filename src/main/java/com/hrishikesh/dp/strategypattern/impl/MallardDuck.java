package com.hrishikesh.dp.strategypattern.impl;

import com.hrishikesh.dp.strategypattern.Duck;
import com.hrishikesh.dp.strategypattern.behaviors.impl.FlyWithWings;
import com.hrishikesh.dp.strategypattern.behaviors.impl.Quack;

/**
 * Created by hrishikesh.mishra
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm Mallard Duck");
    }
}
