package entities;

public class BankAccount {
	private int numberAccount;
	private String accountHoldersName;
	private double InitialDepositValue;
	
	public BankAccount(int numberAccount, String accountHoldersName) {
		this.numberAccount = numberAccount;
		this.accountHoldersName = accountHoldersName;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getAccountHoldersName() {
		return accountHoldersName;
	}

	public void setAccountHoldersName(String accountHoldersName) {
		this.accountHoldersName = accountHoldersName;
	}

	public double getInitialDepositValue() {
		return InitialDepositValue;
	}

	public void setInitialDepositValue(double initialDepositValue) {
		InitialDepositValue = initialDepositValue;
	}
	
	
	@Override
	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ accountHoldersName
				+ ", Balance: $ "
				+ String.format("%.2f", InitialDepositValue);
	}
}
