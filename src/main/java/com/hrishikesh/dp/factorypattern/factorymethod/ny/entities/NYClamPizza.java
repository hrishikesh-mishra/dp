package com.hrishikesh.dp.factorypattern.factorymethod.ny.entities;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra .
 */
public class NYClamPizza extends Pizza {

    public NYClamPizza() {
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
