package com.hrishikesh.dp.statepattern.states;

import com.hrishikesh.dp.statepattern.ATMMachine;
import com.hrishikesh.dp.statepattern.ATMState;

/**
 * @author hrishikesh.mishra
 */
public class NoCardState implements ATMState {
    private ATMMachine machine;

    public NoCardState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        machine.setState(machine.getHasCardState());
        machine.printSuccessMessage("Card Accepted.");
        machine.printSuccessMessage("Please enter pin.");
    }

    @Override
    public void ejectCard() {
        machine.printErrorMessage("First insert card!");
    }

    @Override
    public void insertPin(int pin) {
        machine.printErrorMessage("First insert card!");
    }

    @Override
    public void withdrawCash(int amount) {
        machine.printErrorMessage("First insert card!");
    }
}
