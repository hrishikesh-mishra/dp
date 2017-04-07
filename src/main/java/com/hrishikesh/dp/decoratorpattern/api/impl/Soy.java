package com.hrishikesh.dp.decoratorpattern.api.impl;

import com.hrishikesh.dp.decoratorpattern.api.Beverage;
import com.hrishikesh.dp.decoratorpattern.api.CondimentDecorator;

/**
 * Created by hrishikesh.mishra on 09/08/16.
 */
public class Soy extends CondimentDecorator {

    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}