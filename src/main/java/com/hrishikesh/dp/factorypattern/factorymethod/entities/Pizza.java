package com.hrishikesh.dp.factorypattern.factorymethod.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hrishikesh.mishra
 */
public abstract class Pizza {

    public final static String  CHEESE_PIZZA = "cheese";
    public final static String  PEPPERONI_PIZZA = "pepperoni";
    public final static String  CLAM_PIZZA = "clam";
    public final static String  VEGGIE_PIZZA = "veggie";

    protected String name;
    protected  String dough;
    protected  String sauce;

    protected List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing : " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings");

        for(String topping: toppings)
            System.out.println(" " + topping);
    }

    public void bake(){
        System.out.println("Baking for 25 minutes at 350.");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official Pizza Store box");
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }
}


