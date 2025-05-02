package com.example.dsbkml;

public class Payslip {
    private String employeeId;
    private double grossSalary;
    private double netSalary;

    // Getters and Setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public double getGrossSalary() { return grossSalary; }
    public void setGrossSalary(double grossSalary) { this.grossSalary = grossSalary; }
    public double getNetSalary() { return netSalary; }
    public void setNetSalary(double netSalary) { this.netSalary = netSalary; }

    @Override
    public String toString() {
        return "Payslip for " + employeeId + ": Gross - " + grossSalary + ", Net - " + netSalary;
    }
}