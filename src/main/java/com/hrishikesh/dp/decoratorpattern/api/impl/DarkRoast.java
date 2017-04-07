package com.hrishikesh.dp.decoratorpattern.api.impl;

import com.hrishikesh.dp.decoratorpattern.api.Beverage;

/**
 * Created by hrishikesh.mishra on 09/08/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
