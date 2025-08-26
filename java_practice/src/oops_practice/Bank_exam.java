package oops_practice;

interface Bank1 {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Account {
    protected double balance;

    Account(double initialBalance) {
        balance = initialBalance;
    }
}

class SavingsAccount extends Account implements Bank1 {
    private static final double MIN_BALANCE = 500;

    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of " + MIN_BALANCE + " must be maintained.");
        }
    }
    public double getBalance() {
        return balance;
    }
}

class CurrentAccount extends Account implements Bank1 {

    CurrentAccount(double initialBalance) {
        super(initialBalance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied! Insufficient funds.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Bank_exam {
    public static void main(String[] args) {
        Bank1 savings = new SavingsAccount(1000);
        Bank1 current = new CurrentAccount(2000);

        savings.deposit(500);
        savings.withdraw(800);
        savings.withdraw(300);  

        System.out.println();

        current.deposit(1000);
        current.withdraw(2500);
        current.withdraw(1000);  
    }
}

