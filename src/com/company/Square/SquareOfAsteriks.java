package com.company.Square;

import java.util.Scanner;

public class SquareOfAsteriks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the size of square : ");
        int a = input.nextInt();
        int i,j;

        if (a == 1)
            System.out.print("*");
        else {
            for (i = 0; i < a; i++) {
                System.out.print("* ");
            }

            System.out.println("");

            for (i = 0; i < a - 2; i++) {
                System.out.print("*");
                System.out.print(" ");

                for (j = 0; j < a - 2; j++) {
                    System.out.print("  ");
                }

                System.out.println("*");
            }

            for (i = 0; i < a; i++) {
                System.out.print("* ");
            }
        }
    }
}
