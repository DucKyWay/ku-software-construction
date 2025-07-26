package src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount;

public class BankAccount {
    private double balance;
    private final String accountNumber;
    public static double interestRate;

    BankAccount(double balance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        interestRate = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
