import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        while (true) {
            System.out.println("\n=== Banking System ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    scanner.nextLine(); // Consume newline
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();
                    account = new Account(accountNumber, accountHolderName, initialBalance);
                    System.out.println("Account created Successfully.");
                    break;
                case 2:
                    if (account != null) {
                        System.out.print("Enter Your Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposited Successfully.");
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter Your Withdraw Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawn Successfully.");
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.println("Your balance is: " + account.getAccountDetails());
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the banking system!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");

            }
        }

    }
}