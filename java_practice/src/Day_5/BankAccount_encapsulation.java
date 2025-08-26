package Day_5;

import java.util.ArrayList;
import java.util.List;

public class BankAccount_encapsulation {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private List<String> transactionHistory = new ArrayList<>();

    public BankAccount_encapsulation(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance =balance + amount;
            transactionHistory.add("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance + amount;
            transactionHistory.add("Withdraw: " + amount);
            return true;
        } else {
            transactionHistory.add("Failed withdrawal: " + amount);
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getLastTransaction() {
        if (transactionHistory.isEmpty()) {
            return "No transactions yet.";
        }
        return transactionHistory.get(transactionHistory.size() - 1);
    }

    public String toString() {
        String maskedAccount = "****" + accountNumber.substring(accountNumber.length() - 4);
        return "Account Holder: " + accountHolder + ", Account Number: " + maskedAccount + ", Balance:" + balance;
    }
        public static void main(String[] args) {
        	BankAccount_encapsulation account = new BankAccount_encapsulation("1234567890", "Nikhitha", 5000);

            account.deposit(1500);
            account.withdraw(2000);
            account.withdraw(7000); 

            System.out.println(account); 
            System.out.println("Last Transaction: " + account.getLastTransaction());
            System.out.println("Balance: ₹" + account.getBalance());
        }
    }

