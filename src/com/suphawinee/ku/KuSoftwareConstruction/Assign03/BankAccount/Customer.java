package com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount;

public class Customer {
    private String name;
    private BankAccount account;

    Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}
