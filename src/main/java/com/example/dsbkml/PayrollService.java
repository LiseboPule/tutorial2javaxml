package com.example.dsbkml;

public class PayrollService {
    private PayrollDAO payrollDAO;

    public PayrollService() {
        this.payrollDAO = new PayrollDAO();
    }

    public void generatePayslip(Payslip payslip) {
        payrollDAO.addPayslip(payslip);
    }
}