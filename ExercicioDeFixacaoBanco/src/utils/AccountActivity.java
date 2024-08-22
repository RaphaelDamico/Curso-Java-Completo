package utils;

import java.util.Scanner;

import entities.BankAccount;

public class AccountActivity {
	
	static double initialDepositValue = 0.0;

	public static double isAnInitialDeposit(Scanner sc) {
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response != 'n') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			return initialDepositValue;
		} else {
			return 0.0;
		}
	}

	public static void depositValue(BankAccount bankAccount, double value) {
		double newBallance = bankAccount.getInitialDepositValue() + value;
		bankAccount.setInitialDepositValue(newBallance);
	}
	
	public static void withdrawValue(BankAccount bankAccount, double value) {
		double newBallance = bankAccount.getInitialDepositValue() - (value + 5.00);
		bankAccount.setInitialDepositValue(newBallance);
	}
}
