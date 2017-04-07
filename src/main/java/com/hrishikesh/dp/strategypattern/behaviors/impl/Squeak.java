package com.hrishikesh.dp.strategypattern.behaviors.impl;

import com.hrishikesh.dp.strategypattern.behaviors.QuackBehavior;

/**
 * Created by hrishikesh.mishra on 31/07/16.
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
