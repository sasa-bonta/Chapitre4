package com.company.Factorial;

import java.util.Scanner;

public class Euler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of terms : ");
        int numIter = input.nextInt() - 1;
        int j;
        double euler = 1;

        for (j = 1; j <= numIter; j++) {
            euler += 1 / findFactor(j);
        }

        System.out.printf("The factorial of the number is : %f", euler);
    }

    public static double findFactor(int num) {
        int i;
        int fact = 1;

        for (i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
