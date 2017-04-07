package com.hrishikesh.dp.strategypattern.behaviors.impl;

import com.hrishikesh.dp.strategypattern.behaviors.QuackBehavior;

/**
 * Created by hrishikesh.mishra
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
