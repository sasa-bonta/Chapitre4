package com.company.CreditLimit;

import java.util.Scanner;

public class CustomerTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter account number, balance, debit, credit, limit / or -1 to quit : ");

        int accountNumber = input.nextInt();
        int balanceBegin = input.nextInt();
        int debit = input.nextInt();
        int credit = input.nextInt();
        int allowedCredit = input.nextInt();

        Customer customer = new Customer(accountNumber, balanceBegin, debit, credit, allowedCredit);


        while (accountNumber != -1) {
            newBalance(customer);

            System.out.printf("Enter account number, balance, debit, credit, limit / or -1 to quit : ");

            accountNumber = input.nextInt();
            if (accountNumber == 0)
                break;
            balanceBegin = input.nextInt();
            debit = input.nextInt();
            credit = input.nextInt();
            allowedCredit = input.nextInt();
            customer = new Customer(accountNumber, balanceBegin, debit, credit, allowedCredit);
        }
    }

    public static void newBalance(Customer customer){
        customer.setBalanceBegin(customer.getBalanceBegin() + customer.getDebit() - customer.getCredit());
        if (customer.getBalanceBegin() >= -1 * customer.getAllowedCredit())
            System.out.printf("Account %d balance is %d%n", customer.getAccountNumber(), customer.getBalanceBegin());
        else
            System.out.printf("Account %d Credit limit exceeded%n", customer.getAccountNumber());
    }
}
