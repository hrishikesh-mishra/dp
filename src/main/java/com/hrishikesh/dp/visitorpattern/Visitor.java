package com.hrishikesh.dp.visitorpattern;

/**
 * @author hrishikesh.mishra
 */
public interface Visitor {

    double visit(Liquor liquorItem);

    double visit(Tobacco tobaccoItem);

    double visit(Necessity necessityObject);

}
