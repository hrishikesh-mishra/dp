package com.hrishikesh.dp.factorypattern.abstractfactory;

import com.hrishikesh.dp.factorypattern.abstractfactory.ingredient.*;

/**
 * Created by hrishikesh.mishra
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
