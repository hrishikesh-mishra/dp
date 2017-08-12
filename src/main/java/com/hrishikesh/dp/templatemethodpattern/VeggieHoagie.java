package com.hrishikesh.dp.templatemethodpattern;

/**
 * @author hrishikesh.mishra
 */
public class VeggieHoagie extends Hoagie {

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


    protected boolean customerWantsCheese(){
        return false;
    }

    protected boolean customerWantsMeat() {
        return false;
    }

    @Override
    protected void addCheese() { }

    @Override
    protected void addMeat() { }
}
