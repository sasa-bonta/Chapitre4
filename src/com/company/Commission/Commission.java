package com.company.Commission;

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Item item1 = new Item(1, 239.99);
        Item item2 = new Item(2, 129.75);
        Item item3 = new Item(3, 99.95);
        Item item4 = new Item(4, 350.89);

        System.out.println("Item    Value");
        System.out.printf("%d       %.2f%n", item1.getNrItem(), item1.getPrice());
        System.out.printf("%d       %.2f%n", item2.getNrItem(), item2.getPrice());
        System.out.printf("%d       %.2f%n", item3.getNrItem(), item3.getPrice());
        System.out.printf("%d       %.2f%n", item4.getNrItem(), item4.getPrice());

        System.out.println("");

        int item;
        int quantity;
        double totalSales = 0;

        System.out.print("Enter number of item and sold quantity or -1 to quit : ");
        item = input.nextInt();
        quantity = input.nextInt();

        while (item == 1 || item == 2 || item == 3 || item == 4){
            System.out.print("Enter number of item and sold quantity or -1 to quit : ");
            item = input.nextInt();
            if (item == -1)
                break;
            quantity = input.nextInt();

            switch (item){
                case 1 : totalSales += item1.getPrice() * quantity;
                case 2 : totalSales += item2.getPrice() * quantity;
                case 3 : totalSales += item3.getPrice() * quantity;
                case 4 : totalSales += item4.getPrice() * quantity;
            }
        }
        sumCommission(totalSales);
    }

    public static void sumCommission(double totalSales){
        System.out.printf("Total sales : %.2f  commission : %.2f", totalSales, totalSales * 0.09);
    }
}
