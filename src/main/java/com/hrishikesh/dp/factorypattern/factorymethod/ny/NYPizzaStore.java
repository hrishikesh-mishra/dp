package com.hrishikesh.dp.factorypattern.factorymethod.ny;


import com.hrishikesh.dp.factorypattern.factorymethod.PizzaStore;
import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;
import com.hrishikesh.dp.factorypattern.factorymethod.ny.entities.NYClamPizza;
import com.hrishikesh.dp.factorypattern.factorymethod.ny.entities.NYPepperoniPizza;
import com.hrishikesh.dp.factorypattern.factorymethod.ny.entities.NYVeggiePizza;

/**
 * Created by hrishikesh.mishra
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals(Pizza.CHEESE_PIZZA))
            pizza = new NYVeggiePizza();
        else if(type.equals(Pizza.PEPPERONI_PIZZA))
            pizza = new NYPepperoniPizza();
        else if (type.equals(Pizza.CLAM_PIZZA))
            pizza = new NYClamPizza();
        else if (type.equals(Pizza.VEGGIE_PIZZA))
            pizza = new NYVeggiePizza();

        return pizza;
    }
}
