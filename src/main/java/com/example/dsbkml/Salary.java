// Salary.java
package com.example.dsbkml;

public class Salary {
    public double calculateGrossSalary(double basicSalary, double overtimeHours) {
        double overtimePay = overtimeHours * (basicSalary / 160); // Assuming 160 hours/month
        return basicSalary + overtimePay;
    }

    public double calculateDeductions(double grossSalary) {
        return grossSalary * 0.2; // Example: 20% deduction
    }

    public double calculateNetSalary(double grossSalary) {
        return grossSalary - calculateDeductions(grossSalary);
    }
}