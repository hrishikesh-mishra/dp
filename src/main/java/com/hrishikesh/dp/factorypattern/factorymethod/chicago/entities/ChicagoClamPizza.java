package com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities;

import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra .
 */
public class ChicagoClamPizza extends Pizza {

    public ChicagoClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
