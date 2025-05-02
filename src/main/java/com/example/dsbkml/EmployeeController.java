package com.example.dsbkml;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class EmployeeController {

    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField departmentField;
    @FXML
    private TextField positionField;
    @FXML
    private TextField salaryField;
    @FXML
    private TextField hoursField;
    @FXML
    private ListView<Employee> employeeList;

    private EmployeeService employeeService;

    public EmployeeController() {
        this.employeeService = new EmployeeService();
    }

    @FXML
    public void addEmployee() {
        String employeeId = idField.getText();
        String name = nameField.getText();
        String department = departmentField.getText();
        String position = positionField.getText();
        double basicSalary = Double.parseDouble(salaryField.getText());
        double workingHours = Double.parseDouble(hoursField.getText());

        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setName(name);
        employee.setDepartment(department);
        employee.setPosition(position);
        employee.setBasicSalary(basicSalary);
        employee.setWorkingHours((int) workingHours);

        employeeService.addEmployee(employee);
        updateEmployeeList();
        clearFields();
    }

    private void updateEmployeeList() {
        List<Employee> employees = employeeService.getAllEmployees();
        employeeList.getItems().clear();
        employeeList.getItems().addAll(employees);
    }

    private void clearFields() {
        idField.clear();
        nameField.clear();
        departmentField.clear();
        positionField.clear();
        salaryField.clear();
        hoursField.clear();
    }
}