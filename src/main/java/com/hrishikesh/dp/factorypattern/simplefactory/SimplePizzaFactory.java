package com.hrishikesh.dp.factorypattern.simplefactory;


import com.hrishikesh.dp.factorypattern.simplefactory.entities.impl.ClamPizza;
import com.hrishikesh.dp.factorypattern.simplefactory.entities.Pizza;
import com.hrishikesh.dp.factorypattern.simplefactory.entities.impl.CheesePizza;
import com.hrishikesh.dp.factorypattern.simplefactory.entities.impl.PepperoniPizza;
import com.hrishikesh.dp.factorypattern.simplefactory.entities.impl.VeggiePizza;

/**
 * <p>
 *     Simple Factory is not actually a Design Pattern; it's more
 *    of a programming idiom.
 * </p>
 * Created by hrishikesh.mishra
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals(Pizza.CHEESE_PIZZA))
            pizza = new CheesePizza();
        else if(type.equals(Pizza.PEPPERONI_PIZZA))
            pizza = new PepperoniPizza();
        else if (type.equals(Pizza.CLAM_PIZZA))
            pizza = new ClamPizza();
        else if (type.equals(Pizza.VEGGIE_PIZZA))
            pizza = new VeggiePizza();

        return pizza;
    }
}
