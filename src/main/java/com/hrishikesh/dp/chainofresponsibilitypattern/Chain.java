package com.hrishikesh.dp.chainofresponsibilitypattern;

/**
 * @author hrishikesh.mishra
 */
public interface Chain {

    void setNextChain(Chain nextChain);

    void calculate(Numbers request);
}
