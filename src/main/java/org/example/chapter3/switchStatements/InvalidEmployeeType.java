package org.example.chapter3.switchStatements;

public class InvalidEmployeeType extends Exception {
    public InvalidEmployeeType(EmployeeType type) {
        super("Invalid type: " + type);
    }
}
