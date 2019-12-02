package com.company.Triangle;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sides of triangle : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a * a == b * b + c * c ||
                b * b == a * a + c * c ||
                c * c == b * b + a * a)
            System.out.println("The sides of these lenghts can represent a right triangle");
        else
            System.out.print("The sides of these lenghts can't represent a right triangle");
    }
}
