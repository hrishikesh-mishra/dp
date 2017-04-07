package com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
