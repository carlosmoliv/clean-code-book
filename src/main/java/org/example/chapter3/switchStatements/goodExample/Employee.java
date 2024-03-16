package org.example.chapter3.switchStatements.goodExample;

import org.example.chapter3.switchStatements.Money;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}
