package org.example.chapter2;

public class PayrollCalculator {
    private Employee employee;

    public PayrollCalculator(Employee employee) {
        this.employee = employee;
    }

    public double calculateMonthlySalary() {
        // Logic for calculating monthly salary based on the problem domain rules
        // ...
        return monthlySalary;
    }

    public double calculateOvertimePay(double hoursWorked) {
        // Logic for calculating overtime pay based on the problem domain rules
        // ...
        return overtimePay;
    }
}