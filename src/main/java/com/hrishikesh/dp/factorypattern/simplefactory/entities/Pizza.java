package com.hrishikesh.dp.factorypattern.simplefactory.entities;

/**
 * Created by hrishikesh.mishra
 */
public abstract class Pizza {

    public final static String  CHEESE_PIZZA = "cheese";
    public final static String  PEPPERONI_PIZZA = "pepperoni";
    public final static String  CLAM_PIZZA = "clam";
    public final static String  VEGGIE_PIZZA = "veggie";

    public void prepare(){
        System.out.println("Pizza >> Preparing ");
    }

    public void bake(){
        System.out.println("Pizza >> Baking ");
    }

    public void cut(){
        System.out.println("Pizza >> Cutting ");
    }

    public void box(){
        System.out.println("Pizza >> Boxing ");
    }
}


