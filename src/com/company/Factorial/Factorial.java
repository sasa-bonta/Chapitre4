package com.company.Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int fact = 1;
        int i;

        for (i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.printf("The factorial of the number is : %d", fact);
    }
}
