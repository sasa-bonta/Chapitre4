package com.company.Factorial;

import java.util.Scanner;

public class PowerOfE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int numOfTerms = input.nextInt() - 1;

        System.out.print("Enter the power of e : ");
        double x = input.nextDouble();
        int j;
        double eulerPow = 1;

        for (j = 1; j <= numOfTerms; j++) {
            eulerPow += Math.pow(x, j) / findFactor(j);
            System.out.printf("%f^%d / %f%n = %f", x, j, findFactor(j), eulerPow);
        }

        System.out.printf("The e at the power %f = %f", x, eulerPow);
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
