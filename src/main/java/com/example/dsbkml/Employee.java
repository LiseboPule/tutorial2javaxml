package com.example.dsbkml;

public class Employee {
    private String id;
    private String name;
    private String department;
    private String position;
    private double basicSalary;
    private int workingHours;

    public Employee() {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.basicSalary = basicSalary;
        this.workingHours = workingHours;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")"; // Display name and ID in ListView
    }

    public void setEmployeeId(String employeeId) {

    }
}