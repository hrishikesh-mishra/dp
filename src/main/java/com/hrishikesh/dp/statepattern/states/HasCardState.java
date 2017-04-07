package com.hrishikesh.dp.statepattern.states;

import com.hrishikesh.dp.statepattern.ATMMachine;
import com.hrishikesh.dp.statepattern.ATMState;

/**
 * @author hrishikesh.mishra
 */
public class HasCardState implements ATMState {

    private ATMMachine machine;

    public HasCardState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        machine.printErrorMessage("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        machine.setState(machine.getNoCardState());
        machine.printSuccessMessage("Card Ejected");
    }

    @Override
    public void insertPin(int pin) {
        if (pin == 1234) {
            machine.setState(machine.getHasPinState());
            machine.printSuccessMessage("Correct Pin.");
        } else {
            machine.printErrorMessage("Invalid Pin!!");
            machine.printErrorMessage("Card Ejected");
            machine.setState(machine.getNoCardState());
        }
    }

    @Override
    public void withdrawCash(int amount) {
        machine.printErrorMessage("Enter Pin First!!");
    }


}
