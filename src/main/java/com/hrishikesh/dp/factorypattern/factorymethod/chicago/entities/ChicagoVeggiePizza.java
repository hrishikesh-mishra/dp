package com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities;


import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra
 */
public class ChicagoVeggiePizza extends Pizza {

    public ChicagoVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
