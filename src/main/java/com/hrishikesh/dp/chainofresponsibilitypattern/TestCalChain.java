package com.hrishikesh.dp.chainofresponsibilitypattern;

/**
 * @author hrishikesh.mishra
 */
public class TestCalChain {

    public static void main(String[] args) {
        Chain chain1 = new AddNumber();
        Chain chain2 = new SubtractNumber();
        Chain chain3 = new MultNumber();
        Chain chain4 = new DivideNumber();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request1 = new Numbers(10, 2, "add");
        chain1.calculate(request1);

        Numbers request2 = new Numbers(10, 2, "sub");
        chain1.calculate(request2);

        Numbers request3 = new Numbers(11, 2, "mult");
        chain1.calculate(request3);

        Numbers request4 = new Numbers(11, 2, "div");
        chain1.calculate(request4);

        Numbers request5 = new Numbers(11, 2, "unknown");
        chain1.calculate(request5);






    }
}
