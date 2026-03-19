package Aplication;

import model.Exception.DomainException;
import model.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numberAccount = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdrawal limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.print("");
            Account account = new Account(numberAccount, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.print("New balance: " + account);

        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
