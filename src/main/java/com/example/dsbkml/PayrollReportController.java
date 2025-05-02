package com.example.dsbkml;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.List;

class PayrollReportsController {

    @FXML
    private TextArea summaryArea;
    @FXML
    private Label totalExpensesLabel;
    @FXML
    private BarChart<String, Number> salaryBarChart;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private PieChart salaryPieChart;

    @FXML
    private void initialize() {
        loadPayrollData();
    }

    private void loadPayrollData() {
        // This is where you would fetch data from your database
        // For example, let's assume we have a method that fetches all employees
        List<Employee> employees = fetchEmployees(); // Implement this method to fetch employees

        double totalExpenses = 0;
        for (Employee employee : employees) {
            totalExpenses += employee.getBasicSalary();
            // Populate bar chart data
            // Example: xAxis.getCategories().add(employee.getName());
            // Example: salaryBarChart.getData().add(new XYChart.Series<>(employee.getName(), employee.getBasicSalary()));
        }

        // Update total expenses label
        totalExpensesLabel.setText(String.format("$%.2f", totalExpenses));

        // Populate pie chart
        for (Employee employee : employees) {
            PieChart.Data data = new PieChart.Data(employee.getName(), employee.getBasicSalary());
            salaryPieChart.getData().add(data);
        }

        // Update summary area
        summaryArea.setText("Total Payroll Expenses: $" + totalExpenses);
    }

    private List<Employee> fetchEmployees() {
        return List.of();
    }

    @FXML
    private void handleBack() {
        // Logic to navigate back to the previous screen
    }
}