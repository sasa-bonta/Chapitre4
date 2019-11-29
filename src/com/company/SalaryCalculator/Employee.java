package com.company.SalaryCalculator;

public class Employee {
    private double salaryPerHour;
    private double hours;

    //Constructor
    public Employee(double salaryPerHour, double hours) {
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    //Getters and setters
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
