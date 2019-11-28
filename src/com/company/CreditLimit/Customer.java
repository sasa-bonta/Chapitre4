package com.company.CreditLimit;

public class Customer {
    private int accountNumber;
    private int balanceBegin;
    private int debit;
    private int credit;
    private int allowedCredit;

    //Constructor

    public Customer(int accountNumber, int balanceBegin, int debit, int credit, int allowedCredit) {
        this.accountNumber = accountNumber;
        this.balanceBegin = balanceBegin;
        this.debit = debit;
        this.credit = credit;
        this.allowedCredit = allowedCredit;
    }

    //Getters and setters

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalanceBegin() {
        return balanceBegin;
    }

    public void setBalanceBegin(int balanceBegin) {
        this.balanceBegin = balanceBegin;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getAllowedCredit() {
        return allowedCredit;
    }

    public void setAllowedCredit(int allowedCredit) {
        this.allowedCredit = allowedCredit;
    }
}
