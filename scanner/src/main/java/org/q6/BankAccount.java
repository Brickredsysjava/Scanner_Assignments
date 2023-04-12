package org.q6;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountHolderName);

        while (true) {
            System.out.println();
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Your balance is: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using our banking system!");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }
        }
    }
}
