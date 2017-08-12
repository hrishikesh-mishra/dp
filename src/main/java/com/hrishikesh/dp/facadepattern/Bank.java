package com.hrishikesh.dp.facadepattern;

/**
 * @author hrishikesh.mishra
 */
public class Bank {

    private int cashInAccount = 1000;

    public int getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(int cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }


    public void increaseCashInAccount(int cashWithdrawn) {
        cashInAccount += cashWithdrawn;
    }

    public boolean withdraw(int cashToWithdraw){

        if (getCashInAccount() < cashToWithdraw) {
            System.out.println("Error: You don't have enough money.");
            System.out.println("Current Balance : " + getCashInAccount());
            return false;
        }

        decreaseCashInAccount(cashToWithdraw);
        System.out.println("Cash withdraw completed:");
        System.out.println("Cash in account : " + getCashInAccount());
        return true;
    }

    public void makeDeposit(int cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Cash deposit completed.");
        System.out.println("Current Balance: " + getCashInAccount());
    }
}
