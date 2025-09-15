package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.first;

public class CreditCard implements NegativeCheckable {
    
	private double balance;
    private String name;

    public CreditCard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public String getName() {
    	return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
