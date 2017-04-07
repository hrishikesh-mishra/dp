package com.hrishikesh.dp.decoratorpattern.api.impl;

import com.hrishikesh.dp.decoratorpattern.api.Beverage;

/**
 * Created by hrishikesh.mishra
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
