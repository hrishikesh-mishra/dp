package com.hrishikesh.dp.decoratorpattern.api;

/**
 * Created by hrishikesh.mishra
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
