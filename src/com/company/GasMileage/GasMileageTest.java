package com.company.GasMileage;

import java.util.Scanner;

public class GasMileageTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gasTotal = 0;
        int milesTotal = 0;

        System.out.print("Enter MILEAGE and consumed GAS or -1 to quit : ");
        int miles = input.nextInt();
        int gas = input.nextInt();
        //displayMilesPerGallon(miles, gas);

        while (miles != -1) {
            milesTotal += miles;
            gasTotal += gas;

            displayMilesPerGallon(miles, gas);

            System.out.print("Enter MILEAGE and consumed GAS or -1 to quit : ");
            miles = input.nextInt();
            if (miles == -1)
                break;
            gas = input.nextInt();
        }

        System.out.printf("Medium miles per gallon %.2f.", (float)milesTotal / gasTotal);

    }
    public static void displayMilesPerGallon(int miles, int gas){
        System.out.printf("Durind this trip you were driving %.2f miles per gallon.%n", (float)miles / gas);
    }
}
