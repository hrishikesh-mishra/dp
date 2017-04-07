package com.hrishikesh.dp.factorypattern.factorymethod.ny.entities;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra
 */
public class NYVeggiePizza extends Pizza {

    public NYVeggiePizza() {

        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
