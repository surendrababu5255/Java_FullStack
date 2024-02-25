package surendrababu;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount, with error handling
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
            } else {
                System.out.println("Insufficient funds in account " + accountNumber);
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account information
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create multiple BankAccount instances
        BankAccount account1 = new BankAccount("123456", "John Doe", 100.00);
        BankAccount account2 = new BankAccount("789012", "Jane Smith", 500.00);

        // Simulate transactions
        account1.deposit(50.00);
        account2.withdraw(200.00);
        account1.withdraw(150.00);

        // Display account information
        account1.displayInfo();
        account2.displayInfo();
    }
}
