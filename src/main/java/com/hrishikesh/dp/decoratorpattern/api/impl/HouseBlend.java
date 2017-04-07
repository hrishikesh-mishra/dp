package com.hrishikesh.dp.decoratorpattern.api.impl;

import com.hrishikesh.dp.decoratorpattern.api.Beverage;

/**
 * Created by hrishikesh.mishra on 09/08/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
