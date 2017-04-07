package com.hrishikesh.dp.factorypattern.factorymethod;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Simple Factory Pattern
 * Created by hrishikesh.mishra
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
