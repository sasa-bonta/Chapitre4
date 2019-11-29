package com.company.FindNumber;

import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        System.out.printf("Enter the number Nr. %d : ", counter);
        largest = input.nextInt();

        for (counter = 1; counter < 10; counter++){
            System.out.printf("Enter the number Nr. %d : ", counter + 1);
            number = input.nextInt();

            if (number > largest)
                largest = number;
        }

        System.out.printf("The largest numer is : %d", largest);
    }
}
