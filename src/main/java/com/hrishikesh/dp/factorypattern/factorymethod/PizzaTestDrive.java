package com.hrishikesh.dp.factorypattern.factorymethod;

import com.hrishikesh.dp.factorypattern.factorymethod.chicago.ChicagoPizzaStore;
import com.hrishikesh.dp.factorypattern.factorymethod.ny.NYPizzaStore;
import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

import static com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza.*;
/**
 * Created by hrishikesh.mishra
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(CHEESE_PIZZA);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(CHEESE_PIZZA);
        System.out.println("Joel ordered a " + pizza.getName() +"\n");
    }
}
