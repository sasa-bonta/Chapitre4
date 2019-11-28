package com.company.CreditLimit;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, 1000, 500, 2000, 100);
        newBalance(customer1);
        Customer customer2 = new Customer(2, 1000, 500, 750, 200);
        newBalance(customer2);
    }

    public static void newBalance(Customer customer){
        //System.out.printf("%d balance is %d", accountNumber, balanceBegin + debit -credit);
        customer.setBalanceBegin(customer.getBalanceBegin() + customer.getDebit() - customer.getCredit());
        if (customer.getBalanceBegin() > customer.getAllowedCredit())
            System.out.printf("Account %d balance is %d%n", customer.getAccountNumber(), customer.getBalanceBegin());
        else
            System.out.printf("Account %d Credit limit exceeded%n", customer.getAccountNumber());
    }
}
