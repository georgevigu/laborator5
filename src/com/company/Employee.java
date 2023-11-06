package com.company;

public class Employee {
    public String nume, email;
    public double hourRate, capacity;
    public int freeDays;

    public Employee(String nume, String email, double hourRate, double capacity, int freeDays){
        this.nume=nume;
        this.email=email;
        this.hourRate=hourRate;
        this.capacity=capacity;
        this.freeDays=freeDays;
    }

    public double calculateDailyIncome() {
        return capacity * hourRate;
    }
    public double calculateMonthlyIncome() {
        double x = calculateDailyIncome();
        return x*(30-freeDays);
    }
}
