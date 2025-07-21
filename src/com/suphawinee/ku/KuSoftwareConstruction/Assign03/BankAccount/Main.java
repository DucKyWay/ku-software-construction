package src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount;

public class Main {
    public static void main(String[] args) {
        // สร้าง object ของ BankAccount และ Customer
        src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.BankAccount account = new src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.BankAccount(1000.0, "123456789");
        src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.Customer customer = new src.com.suphawinee.ku.KuSoftwareConstruction.Assign03.BankAccount.Customer("Thammakorn Saetang", account);

        // แก้ไข interestRate ผ่านชื่อคลาส
        customer.getAccount().interestRate = 3.5;
        System.out.println("Interest Rate: " + customer.getAccount().getInterestRate());

        // ทดลองเข้าถึง balance โดยตรงจาก main
        // System.out.println(account.balance); // ❌ ERROR: balance มี access modifier เป็น private
        // อธิบายผลลัพธ์: ไม่สามารถเข้าถึง balance ได้โดยตรงจากภายนอกคลาส เนื่องจากมันเป็น private

        // ทดลองแก้ไข accountNumber
        // account.accountNumber = "987654321"; // ❌ ERROR: accountNumber เป็น final และ private
        // อธิบายผลลัพธ์: ไม่สามารถแก้ไข accountNumber ได้ เพราะเป็นตัวแปร final และมี access modifier เป็น private
        // สามารถเข้าถึงได้เฉพาะผ่านเมธอด getAccountNumber()

        // ทางเลือกที่ถูกต้อง
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
