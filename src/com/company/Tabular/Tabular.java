package com.company.Tabular;

public class Tabular {

    public static void main(String[] args) {
        int n;

        System.out.println("N       10 *N       100*N       1000*N");
        System.out.println("");


        for (n = 1; n <= 5; n++){
            System.out.printf("%d       %d          %d         %d%n", n, 10 * n, 100 * n, 1000 * n);
        }
    }
}
