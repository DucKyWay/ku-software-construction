package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.second;

class CreditCard implements Comparable<CreditCard> {
    private String number;
    private double balance;

    public CreditCard(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(CreditCard other) {
        // น้อย _> มาก
        return Double.compare(this.balance, other.balance);
    }

    @Override
    public String toString() {
        return "CreditCard{number='" + number + "', balance=" + balance + "}";
    }
}
