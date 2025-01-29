import java.util.Scanner;

class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + String.format("%.2f", amount));
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds. Current balance: ₹" + String.format("%.2f", balance));
        }
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + String.format("%.2f", amount));
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a bank account
        BankAccount account = new BankAccount("12345", 10000);
        System.out.println("Welcome to the Banking System!");
        System.out.println("Your account number: " + account.getAccountNumber());
        System.out.println("Initial balance: ₹" + String.format("%.2f", account.getBalance()));

        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter deposit amount (₹): ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter withdrawal amount (₹): ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Current balance: ₹" + String.format("%.2f", account.getBalance()));
                    break;

                case 4: // Exit
                    running = false;
                    System.out.println("Thank you for using the Banking System!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
