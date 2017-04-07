package com.hrishikesh.dp.strategypattern.impl;

import com.hrishikesh.dp.strategypattern.Duck;
import com.hrishikesh.dp.strategypattern.behaviors.impl.FlyNoWay;
import com.hrishikesh.dp.strategypattern.behaviors.impl.Quack;

/**
 * Created by hrishikesh.mishra
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
