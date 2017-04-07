package com.hrishikesh.dp.statepattern.states;

import com.hrishikesh.dp.statepattern.ATMMachine;
import com.hrishikesh.dp.statepattern.ATMState;

/**
 * @author hrishikesh.mishra
 */
public class HasPinState implements ATMState {

    private ATMMachine machine;

    public HasPinState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCard() {
        machine.printErrorMessage("First remove inserted card!");
    }

    @Override
    public void ejectCard() {
        machine.setState(machine.getNoCardState());
        machine.printSuccessMessage("Card ejected");
    }

    @Override
    public void insertPin(int pin) {
        machine.printErrorMessage("You already entered pin.");
    }

    @Override
    public void withdrawCash(int amount) {

        if (machine.getCashInMachine() >= amount) {
            machine.printSuccessMessage(amount + " Cash dispensed");
            machine.setCashInMachine(machine.getCashInMachine() - amount);

            if (machine.getCashInMachine() <= 0) {
                machine.setState(machine.getNoCashState());
            } else {
                machine.setState(machine.getNoCardState());
            }

        } else {
            machine.printErrorMessage("Not enough money to dispense!");
            machine.setState(machine.getNoCardState());
        }
    }
}
