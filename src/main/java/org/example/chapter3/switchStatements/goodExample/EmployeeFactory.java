package org.example.chapter3.switchStatements.goodExample;

import org.example.chapter3.switchStatements.InvalidEmployeeType;

public interface EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
}
