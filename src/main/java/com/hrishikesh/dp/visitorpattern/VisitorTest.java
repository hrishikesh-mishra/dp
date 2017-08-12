package com.hrishikesh.dp.visitorpattern;

/**
 * @author hrishikesh.mishra
 */
public class VisitorTest {

    public static void main(String[] args) {
        Visitor taxVisitor = new TaxVisitor();
        Visitor holidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.20);
        Liquor vodka = new Liquor(9.99);
        Tobacco cigars = new Tobacco(6.20);

        System.out.println(milk.accept(taxVisitor));
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor));

        System.out.println("TAX HOLIDAY PRICES\n");
        System.out.println(milk.accept(holidayVisitor));
        System.out.println(vodka.accept(holidayVisitor));
        System.out.println(cigars.accept(holidayVisitor));

    }
}
