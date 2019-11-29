package com.company.TwoLargest;

import java.util.Scanner;

public class TwoLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest1;
        int largest2;
        int temp;

        System.out.printf("Enter the number Nr. %d : ", counter);
        largest1 = input.nextInt();

        System.out.printf("Enter the number Nr. %d : ", counter+ 1);
        largest2 = input.nextInt();

        for (counter = 2; counter < 10; counter++){
            System.out.printf("Enter the number Nr. %d : ", counter + 1);
            number = input.nextInt();

            if (number > largest1)
                largest1 = number;

            if (number > largest2 && number != largest1)
                largest2 = number;
        }


        if (largest2 > largest1){
            temp = largest1;
            largest1 = largest2;
            largest2 = temp;
        }

        System.out.printf("The largest numers are 1) %d 2) %d", largest1, largest2);
    }
}
