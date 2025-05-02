package com.example.dsbkml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.util.List;

public class EmployeeManagementController {

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

    public EmployeeManagementController() {
        this.employeeService = new EmployeeService();
    }

    @FXML
    private void initialize() {
        updateEmployeeList();
    }

    @FXML
    public void addEmployee() {
        String id = idField.getText();
        String name = nameField.getText();
        String department = departmentField.getText();
        String position = positionField.getText();
        String salaryText = salaryField.getText();
        String hoursText = hoursField.getText();

        if (id.isEmpty() || name.isEmpty() || department.isEmpty() || position.isEmpty() || salaryText.isEmpty() || hoursText.isEmpty()) {
            showAlert("All fields must be filled out.");
            return;
        }

        double salary = Double.parseDouble(salaryText);
        int hours = Integer.parseInt(hoursText);

        Employee newEmployee = new Employee();
        employeeService.addEmployee(newEmployee);
        updateEmployeeList();
        clearFields();
    }

    @FXML
    public void updateEmployee() {
        Employee selectedEmployee = employeeList.getSelectionModel().getSelectedItem();
        if (selectedEmployee == null) {
            showAlert("Select an employee to update.");
            return;
        }

        String name = nameField.getText();
        String department = departmentField.getText();
        String position = positionField.getText();
        String salaryText = salaryField.getText();
        String hoursText = hoursField.getText();

        if (name.isEmpty() || department.isEmpty() || position.isEmpty() || salaryText.isEmpty() || hoursText.isEmpty()) {
            showAlert("All fields must be filled out.");
            return;
        }

        double salary = Double.parseDouble(salaryText);
        int hours = Integer.parseInt(hoursText);

        selectedEmployee.setName(name);
        selectedEmployee.setDepartment(department);
        selectedEmployee.setPosition(position);
        selectedEmployee.setBasicSalary(salary);
        selectedEmployee.setWorkingHours(hours);

        employeeService.updateEmployee(selectedEmployee);
        updateEmployeeList();
        clearFields();
    }

    @FXML
    public void deleteEmployee() {
        Employee selectedEmployee = employeeList.getSelectionModel().getSelectedItem();
        if (selectedEmployee == null) {
            showAlert("Select an employee to delete.");
            return;
        }

        employeeService.deleteEmployee(selectedEmployee.getId());
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

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void handleAddEmployee(ActionEvent actionEvent) {
    }

    public void handleUpdateEmployee(ActionEvent actionEvent) {

    }

    public void handleDeleteEmployee(ActionEvent actionEvent) {
    }

    public void handleBack(ActionEvent actionEvent) {
    }
}