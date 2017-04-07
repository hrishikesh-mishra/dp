package com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra
 */
public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza() {

        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
