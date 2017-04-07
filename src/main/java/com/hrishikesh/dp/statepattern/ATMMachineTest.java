package com.hrishikesh.dp.statepattern;

/**
 * @author hrishikesh.mishra
 */
public class ATMMachineTest {
    public static void main(String[] args) {

        ATMMachine atm = new ATMMachine(100);

        atm.insertCard();

        atm.ejectCard();

        atm.insertCard();

        atm.insertPin(1234);

        atm.withdrawCash(90);

        atm.insertCard();

        atm.ejectCard();


    }
}
