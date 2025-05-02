package com.example.dsbkml;

import java.util.ArrayList;
import java.util.List;

public class PayrollDAO {
    private List<Payslip> payslips = new ArrayList<>();

    public void addPayslip(Payslip payslip) {
        payslips.add(payslip);
    }

    public List<Payslip> getAllPayslips() {
        return payslips;
    }
}