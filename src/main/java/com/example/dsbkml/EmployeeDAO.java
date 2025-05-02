package com.example.dsbkml;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}