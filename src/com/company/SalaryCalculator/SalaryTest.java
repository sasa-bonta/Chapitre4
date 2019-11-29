package com.company.SalaryCalculator;

import java.util.Scanner;

public class SalaryTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        double hourlyRate;
        double hours;

        for (i = 0; i < 3; i++){
            System.out.printf("Enter hourly rate and number of hours of employee Nr. %d : ", i + 1);
            hourlyRate = input.nextDouble();
            hours = input.nextDouble();
            Employee employee = new Employee(hourlyRate, hours);
            salaryCalculator(employee, i + 1);
        }
    }
    public static void salaryCalculator(Employee employee, int i){

        if (employee.getHours() > 40)
            extraHours(employee, i);
        else
            System.out.printf("Employee's Nr. %d salary is : %.2f%n", i,
                    employee.getHours() * employee.getSalaryPerHour());
    }

    public static void extraHours(Employee employee, int i){
        System.out.printf("Employee's Nr. %d salary is : %.2f%n", i,
                employee.getSalaryPerHour() * ( 40 + (employee.getHours() - 40) * 1.5));
    }
}
