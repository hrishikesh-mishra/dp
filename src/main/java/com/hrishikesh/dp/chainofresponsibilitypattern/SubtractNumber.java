package com.hrishikesh.dp.chainofresponsibilitypattern;

/**
 * @author hrishikesh.mishra
 */
public class SubtractNumber implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "sub"){
            System.out.printf("%d - %d = %d \n", request.getNumber1(), request.getNumber2() ,
                    (request.getNumber1() - request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
