public class Account {
    private String accountNo;
    private String accountName;
    private double balance;

    public Account(String accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited $" + amount + ".");
        } else {
            System.out.println("Not enough money");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn $" + amount + ".");
        } else {
            System.out.println("Not enough money");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountDetails() {
        return "Account No: " + accountNo + ", Account Name: " + accountName + ", Balance: " + balance;
    }
}
