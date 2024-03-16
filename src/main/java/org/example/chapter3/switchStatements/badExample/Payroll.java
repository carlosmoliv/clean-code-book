package org.example.chapter3.switchStatements.badExample;


import org.example.chapter3.switchStatements.InvalidEmployeeType;
import org.example.chapter3.switchStatements.Money;

public class Payroll {
    // This function is too large and every time a new Employee type is created, it will grow larger
    // Does more than one thing
    // Violates the SRP, there is more than one reason for it to change
    // It violates the OCP because must change wherever new types are added
    // and a lot of functions will have the same structure which is the worst problem
    //
    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type()) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type());
        }
    }

    private Money calculateSalariedPay(Employee e) {
        return null;
    }

    private Money calculateHourlyPay(Employee e) {
        return null;
    }

    private Money calculateCommissionedPay(Employee e) {
        return null;
    }
}
