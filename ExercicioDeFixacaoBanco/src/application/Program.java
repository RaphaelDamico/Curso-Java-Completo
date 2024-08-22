package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;
import utils.AccountActivity;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        
        System.out.println();
        double initialDeposit = AccountActivity.isAnInitialDeposit(sc);
        
        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder);
        bankAccount.setInitialDepositValue(initialDeposit);
        
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bankAccount);
        
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        AccountActivity.depositValue(bankAccount, depositValue);
        
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
        
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble(); 
        AccountActivity.withdrawValue(bankAccount, withdrawValue);
        
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);
        
        sc.close();
    }
}