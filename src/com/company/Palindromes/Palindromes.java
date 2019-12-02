package com.company.Palindromes;

import java.util.Scanner;

public class Palindromes {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter 5 digit integer : ");
            int pal = input.nextInt();

            while (pal / 10000 < 1 || pal / 100000 > 0) {
                System.out.println("Error");

                System.out.print("Enter 5 digit integer : ");
                pal = input.nextInt();

            }

            isPalindrome(pal);
        }

        public static void isPalindrome(int pal){
            int i;
            if (pal / 10000 ==pal % 10 && (pal / 1000) % 10 == (pal / 10) % 10)
                System.out.println("Is palindrome");
            else
                System.out.print("Not palindrome");
        }
}


