public class SavingsAccount extends Account {
    private static final Double MINIMUM_BALANCE = 100.0;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    public void withdraw(double amount) {
        if (getBalance()- amount >= MINIMUM_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }


}
