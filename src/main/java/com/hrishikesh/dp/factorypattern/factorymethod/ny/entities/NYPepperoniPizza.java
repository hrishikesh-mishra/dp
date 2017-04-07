package com.hrishikesh.dp.factorypattern.factorymethod.ny.entities;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra
 */
public class NYPepperoniPizza extends Pizza {

    public NYPepperoniPizza() {
        name = "NY Style Sauce and Pepperon Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
