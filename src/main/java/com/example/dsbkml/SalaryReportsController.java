package com.example.dsbkml;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class SalaryReportsController {

    @FXML
    private ListView<String> salaryReportsList;

    @FXML
    private void initialize() {
        loadSalaryReports();
    }

    private void loadSalaryReports() {
        // Load and display salary reports
    }
}