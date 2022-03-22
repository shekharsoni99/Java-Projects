package com.masai;
import java.util.InputMismatchException;
import java.util.Scanner;

class BankDemo{
    public static void main(String[] args) throws InsufficientFundException{

        Scanner sc = new Scanner(System.in);
        SavingAccount sa = new SavingAccount();

        System.out.println("Press 'd' to deposit money or 'w' to withdraw money");
        String input = sc.next();

        if(input.equalsIgnoreCase("d")) {
            try {
                System.out.println("Enter your account number (eg: 12345)");
                int accountNumber = sc.nextInt();

                System.out.println("Enter the amount to want to deposit");
                int amount = sc.nextInt();

                double balance = sa.deposit(amount, accountNumber);
                System.out.println("Money deposited successfully, your current balance is: " + balance);
            }
            catch (InputMismatchException x) {
                System.out.println("Please enter valid amount");
            }
            catch (InsufficientFundException e) {
                System.out.println(e.getMessage());
            }
        }


        if(input.equalsIgnoreCase("w")) {
            try {
                System.out.println("Enter amount to withdraw");
                int amount = sc.nextInt();
                double balance = sa.withdraw(amount);
                System.out.println("Money withdrawal successfully, updated balance is: " + balance);
            }catch (InsufficientFundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class SavingAccount {
    int accountNumber = 12345;
    double balance = 5000;

    double deposit(int amount, int acnum) throws InsufficientFundException{

        if(acnum != accountNumber) {
            InsufficientFundException ife = new InsufficientFundException("Account number is wrong");
            throw ife;
        }
        else {
            balance += amount;
            return balance;
        }
    }

    double withdraw(int amount) throws InsufficientFundException {
        if(amount > balance) {
            InsufficientFundException ife = new InsufficientFundException("Insufficient Amount in the Account");
            throw ife;
        }
        else {
            return (balance-amount);
        }
    }
}