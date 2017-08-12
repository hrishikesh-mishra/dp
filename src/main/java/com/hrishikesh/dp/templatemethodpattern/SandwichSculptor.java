package com.hrishikesh.dp.templatemethodpattern;

/**
 * @author hrishikesh.mishra
 */
public class SandwichSculptor  {

    public static void main(String[] args) {

        Hoagie customer1 = new ItalianHoagie();
        customer1.makeSandwich();

        System.out.println("\n\n\n");
        Hoagie customer2 = new VeggieHoagie();
        customer2.makeSandwich();
    }
}
