package com.example.dsbkml;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class PayslipController {

    @FXML
    private ListView<Payslip> payslipList;

    @FXML
    private void initialize() {
        loadPayslips();
    }

    private void loadPayslips() {
        // Load and display payslips
    }
}