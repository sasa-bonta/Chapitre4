package com.company.DecimalEquivalent;

import java.util.Scanner;

public class DecimalEquivalent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int binar = input.nextInt();
        int i =0;
        int decimal = 0;

        while (binar > 0) {
            decimal += (binar % 10) * Math.pow(2, i);
            binar = binar / 10;
            i++;
        }

        System.out.println(decimal);
    }
}
