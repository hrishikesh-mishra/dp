package com.hrishikesh.dp.decoratorpattern.api;

import com.hrishikesh.dp.decoratorpattern.api.impl.*;

/**
 * Created by hrishikesh.mishra on 09/08/16.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        /** Order up an espresso, no condiments and prints its description and cost **/
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        /** Make a DarkRoast Object **/
        Beverage beverage2 = new DarkRoast();
        /** Wrap it with a Mocha **/
        beverage2 = new Mocha(beverage2);
        /** Wrap it in a second Mocha **/
        beverage2 = new Mocha(beverage2);
        /** Wrap it in a Whip **/
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        /** Finally, give us a HouseBlend with Soy, Mocha, and Whip **/
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
