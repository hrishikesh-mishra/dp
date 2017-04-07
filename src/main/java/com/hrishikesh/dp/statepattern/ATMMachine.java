package com.hrishikesh.dp.statepattern;

import com.hrishikesh.dp.statepattern.states.HasCardState;
import com.hrishikesh.dp.statepattern.states.HasPinState;
import com.hrishikesh.dp.statepattern.states.NoCardState;
import com.hrishikesh.dp.statepattern.states.NoCashState;

/**
 * @author hrishikesh.mishra
 */
public class ATMMachine {

    private ATMState currentState;
    private Long cashInMachine;

    private ATMState hasCardState;
    private ATMState hasPinState;
    private ATMState noCardState;
    private ATMState noCashState;

    public ATMMachine(long cashInMachine ) {
        this.cashInMachine = cashInMachine;
        this.hasCardState = new HasCardState(this);
        this.hasPinState = new HasPinState(this);
        this.noCardState = new NoCardState(this);
        this.noCashState = new NoCashState(this);

        if (cashInMachine <= 0) {
            currentState = this.noCashState;
        }else {
            currentState = this.noCardState;
        }
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void insertPin(int pin) {
        currentState.insertPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getHasPinState() {
        return hasPinState;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public Long getCashInMachine() {
        return cashInMachine;
    }

    public void setCashInMachine(Long cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void printSuccessMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String message) {
        System.out.println(message);
    }
}
