package com.hrishikesh.dp.templatemethodpattern;

/**
 * @author hrishikesh.mishra
 */
public class ItalianHoagie extends Hoagie {

    String [] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String [] cheeseUsed = {"Provolone"};
    String [] vegetableUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String [] condimentsUsed = {"Oil", "Vinegars"};

    @Override
    protected void addCondiments() {
        System.out.print("\nAdding Condiments: ");
        for (String condiment: condimentsUsed){
            System.out.print(condiment + " ");
        }
    }

    @Override
    protected void addVegetables() {
        System.out.print("\nAdding the Vegetables: ");
        for (String veg: vegetableUsed){
            System.out.print(veg + " ");
        }
    }

    @Override
    protected void addCheese() {
        System.out.print("\nAdding the cheese: ");
        for (String cheese: cheeseUsed){
            System.out.print(cheese + " ");
        }
    }

    @Override
    protected void addMeat() {
        System.out.print("\nAdding the meat: ");
        for (String meat: meatUsed){
            System.out.print(meat + " ");
        }
    }
}
