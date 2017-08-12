package com.hrishikesh.dp.visitorpattern;

/**
 * @author hrishikesh.mishra
 */
public interface Visitable {

    double accept(Visitor visitor);

}
