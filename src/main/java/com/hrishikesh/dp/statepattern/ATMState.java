package com.hrishikesh.dp.statepattern;

/**
 * ATM State Machine Possible State
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pin);

    void withdrawCash(int amount);
}