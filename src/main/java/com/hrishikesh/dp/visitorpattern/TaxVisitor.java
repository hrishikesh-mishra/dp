package com.hrishikesh.dp.visitorpattern;

import java.text.DecimalFormat;

/**
 * @author hrishikesh.mishra
 */
public class TaxVisitor implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item : price with tax");
        return Double.parseDouble(decimalFormat.format(liquorItem.getPrice() * .17)) + liquorItem.getPrice();
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item : price with tax");
        return Double.parseDouble(decimalFormat.format(tobaccoItem.getPrice() * 0.32)) + tobaccoItem.getPrice();
    }

    @Override
    public double visit(Necessity necessityObject) {
        System.out.println("Necessity item : price with tax");
        return Double.parseDouble(decimalFormat.format(necessityObject.getPrice() * 0)) + necessityObject.getPrice();
    }
}
