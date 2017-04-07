package com.hrishikesh.dp.statepattern.states;

import com.hrishikesh.dp.statepattern.ATMMachine;
import com.hrishikesh.dp.statepattern.ATMState;

/**
 * @author hrishikesh.mishra
 */
public class NoCashState implements ATMState {

    private ATMMachine machine;

    public NoCashState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        machine.printErrorMessage("Machine doesn't have money");
    }

    @Override
    public void ejectCard() {
        machine.printErrorMessage("Machine doesn't have money");
    }

    @Override
    public void insertPin(int pin) {
        machine.printErrorMessage("Machine doesn't have money");
    }

    @Override
    public void withdrawCash(int amount) {
        machine.printErrorMessage("Machine doesn't have money");
    }
}
