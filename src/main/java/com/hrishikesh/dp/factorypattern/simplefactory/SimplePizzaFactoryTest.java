package com.hrishikesh.dp.factorypattern.simplefactory;

import static com.hrishikesh.dp.factorypattern.simplefactory.entities.Pizza.*;


/**
 * Created by hrishikesh.mishra
 */
public class SimplePizzaFactoryTest {

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza(CHEESE_PIZZA);
    }
}
