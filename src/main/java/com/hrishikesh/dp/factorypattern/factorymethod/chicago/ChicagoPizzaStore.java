package com.hrishikesh.dp.factorypattern.factorymethod.chicago;


import com.hrishikesh.dp.factorypattern.factorymethod.PizzaStore;
import com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities.ChicagoClamPizza;
import com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities.ChicagoPepperoniPizza;
import com.hrishikesh.dp.factorypattern.factorymethod.chicago.entities.ChicagoVeggiePizza;
import com.hrishikesh.dp.factorypattern.factorymethod.entities.Pizza;

/**
 * Created by hrishikesh.mishra
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals(Pizza.CHEESE_PIZZA))
            pizza = new ChicagoVeggiePizza();
        else if(type.equals(Pizza.PEPPERONI_PIZZA))
            pizza = new ChicagoPepperoniPizza();
        else if (type.equals(Pizza.CLAM_PIZZA))
            pizza = new ChicagoClamPizza();
        else if (type.equals(Pizza.VEGGIE_PIZZA))
            pizza = new ChicagoVeggiePizza();

        return pizza;
    }
}
