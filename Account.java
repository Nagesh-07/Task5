import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;  // stores transaction logs

    // Constructor
    public Account(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: ₹" + initialBalance);
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount + " | New Balance: ₹" + balance);
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Show transaction history
    public void showTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
