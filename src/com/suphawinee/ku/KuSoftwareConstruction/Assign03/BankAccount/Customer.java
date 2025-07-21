package src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount;

public class Customer {
    private String name;
    private src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.BankAccount account;

    Customer(String name, src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.BankAccount getAccount() {
        return account;
    }
}
