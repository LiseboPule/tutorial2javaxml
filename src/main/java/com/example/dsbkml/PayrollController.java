package com.example.dsbkml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PayrollController {

    @FXML
    private TextField employeeIdField;
    @FXML
    private TextField grossSalaryField;
    @FXML
    private TextField netSalaryField;
    @FXML
    private ListView<Payslip> payslipList;

    private PayrollService payrollService;

    public PayrollController() {
        this.payrollService = new PayrollService();
    }

    @FXML
    public void generatePayslip() {
        String employeeId = employeeIdField.getText();
        double grossSalary = Double.parseDouble(grossSalaryField.getText());
        double netSalary = Double.parseDouble(netSalaryField.getText());

        Payslip payslip = new Payslip();
        payslip.setEmployeeId(employeeId);
        payslip.setGrossSalary(grossSalary);
        payslip.setNetSalary(netSalary);

        payrollService.generatePayslip(payslip);
        updatePayslipList();
        clearFields();
    }

    private void updatePayslipList() {
        // Logic to update payslip list
    }

    private void clearFields() {
        employeeIdField.clear();
        grossSalaryField.clear();
        netSalaryField.clear();
    }

    public void handleBack(ActionEvent actionEvent) {

    }
}