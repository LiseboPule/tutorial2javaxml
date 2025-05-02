package com.example.dsbkml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Label totalEmployeesLabel;

    @FXML
    private Label totalPayrollLabel;

    @FXML
    private Button employeeManagementButton;

    @FXML
    private Button salaryReportsButton;

    @FXML
    private Button generatePayslipButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button backButton;

    private EmployeeService employeeService;

    public DashboardController() {
        this.employeeService = new EmployeeService();
    }

    @FXML
    public void initialize() {
        totalEmployeesLabel.setText("Total Employees: " + getTotalEmployees());
        totalPayrollLabel.setText("Total Payroll Expenses: M" + getTotalPayroll());
    }

    private int getTotalEmployees() {
        return employeeService.getAllEmployees().size();
    }

    private double getTotalPayroll() {
        return employeeService.calculateTotalPayroll();
    }

    @FXML
    private void handleEmployeeManagement() {
        loadPage("employee_management.fxml");
    }

    @FXML
    private void handleSalaryReports() {
        loadPage("salary_reports.fxml");
    }

    @FXML
    private void handleGeneratePayslip() {
        loadPage("payslip_generation.fxml");
    }

    @FXML
    private void handleLogout() {
        // Logic for logging out the admin
    }

    @FXML
    private void handleBack() {
        // Logic to go back to the previous screen
        // For example, load the login screen
        loadPage("login.fxml");
    }

    private void loadPage(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/dsbkml/" + fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) totalEmployeesLabel.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}