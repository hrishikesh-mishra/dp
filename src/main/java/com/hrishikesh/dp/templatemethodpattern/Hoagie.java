package com.hrishikesh.dp.templatemethodpattern;

/**
 * @author hrishikesh.mishra
 */
public abstract class Hoagie {

    public final void makeSandwich(){
        cutBun();

        if (customerWantsMeat()){
            addMeat();
        }

        if (customerWantsCheese()){
            addCheese();
        }

        if (customerWantsVegetables()){
            addVegetables();
        }

        if (customerWantsCondiments()){
            addCondiments();
        }

        wrapHoagie();
    }

    protected abstract void addCondiments();

    protected abstract void addVegetables();

    protected abstract void addCheese();

    protected abstract void addMeat();

    protected void wrapHoagie(){
        System.out.println("\nWrapping Hoagie");
    }

    protected  void cutBun(){
        System.out.println("The Hoagie is cut");
    }

    protected boolean customerWantsCondiments(){
        return true;
    }


    protected boolean customerWantsVegetables(){
        return true;
    }

    protected boolean customerWantsCheese(){
        return true;
    }

    protected boolean customerWantsMeat() {
        return true;
    }

}
