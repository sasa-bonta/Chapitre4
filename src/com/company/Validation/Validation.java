package com.company.Validation;

    import java.util.Scanner;

    public class Validation {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int failures = 0;

            System.out.print("Enter result (0, 3, 4, 5, 6, 7, 8, 9 = pass, 1, 2 = fail): ");
            int result = input.nextInt();

            while (result != 1 && result != 2) {
                System.out.print("Enter result (0, 3, 4, 5, 6, 7, 8, 9 = pass, 1, 2 = fail): ");
                result = input.nextInt();
                    failures = failures + 1;

            }

            System.out.printf("Passed: %d%nFailed: %d%n", 1, failures);
        }
    }
