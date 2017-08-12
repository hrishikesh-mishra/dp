package com.hrishikesh.dp.facadepattern;

/**
 * @author hrishikesh.mishra
 */
public class AccountNumberCheck {

    private int accountNumber =1234567;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean  accountActive(int accountToCheck){
        return getAccountNumber() == accountToCheck;
    }
}
