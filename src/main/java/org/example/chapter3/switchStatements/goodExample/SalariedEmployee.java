package org.example.chapter3.switchStatements.goodExample;

import org.example.chapter3.switchStatements.Money;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
