package com.company.Triangle;

import java.util.Scanner;

public class SidesOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sides of triangle : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a <= b + c && b <= a + c && c <= a + b)
            System.out.print("The sides of these lenghts can represent a triangle");
        else
            System.out.print("The sides of these lenghts can't represent a triangle");
    }
}
