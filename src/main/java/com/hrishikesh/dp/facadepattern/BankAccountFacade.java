package com.hrishikesh.dp.facadepattern;

/**
 * @author hrishikesh.mishra
 */
public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeChecker securityCodeChecker;
    private Bank bank;
    private WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        accountNumberCheck = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeChecker();
        welcomeToBank = new WelcomeToBank();
        bank = new Bank();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(int cash) {

        if (accountNumberCheck.accountActive(getAccountNumber()) &&
                securityCodeChecker.isCodeCorrect(getSecurityCode()) &&
                bank.withdraw(cash)){
            System.out.println("Transaction completed ");
        }else {
            System.out.println("Transition Failed.");
        }
    }

    public void depositCash(int cash) {

        if (accountNumberCheck.accountActive(getAccountNumber()) &&
                securityCodeChecker.isCodeCorrect(getSecurityCode())){
            bank.makeDeposit(cash);
            System.out.println("Transaction completed ");
        }else {
            System.out.println("Transition Failed.");
        }

    }
}
