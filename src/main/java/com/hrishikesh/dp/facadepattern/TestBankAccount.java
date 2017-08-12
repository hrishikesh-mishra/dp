package com.hrishikesh.dp.facadepattern;

/**
 * @author hrishikesh.mishra
 */
public class TestBankAccount {

    public static void main(String[] args) {
        BankAccountFacade accessingBank  = new BankAccountFacade(1234567, 321);

        accessingBank.withdrawCash(50);
        accessingBank.withdrawCash(900);
        accessingBank.depositCash(50);
    }
}
