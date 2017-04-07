package com.hrishikesh.dp.factorypattern.simplefactory;


import com.hrishikesh.dp.factorypattern.simplefactory.entities.Pizza;

/**
 * Simple Factory Pattern
 * Created by hrishikesh.mishra
 */
public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.factory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
