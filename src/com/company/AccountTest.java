package com.company;
import  java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green",50.00);
        Account account2 = new Account("John Blue",0.00);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding  %.2f to account1 balance %n%n",depositAmount);
        account1.Deposit(depositAmount);

       System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.println("Enter deposit for account2: ");
         depositAmount = input.nextDouble();
        System.out.printf("%nadding  %.2f to account2 balance %n%n",depositAmount);
        account2.Deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

       System.out.println("Enter withdrawal for account1: ");
        double withdrawalAmount = input.nextDouble();
        account1.withdrawal(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

        System.out.println("Enter withdrawal for account2: ");
        withdrawalAmount = input.nextDouble();
        account2.withdrawal(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n",account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f%n",account2.getName(),account2.getBalance());

    }

}
