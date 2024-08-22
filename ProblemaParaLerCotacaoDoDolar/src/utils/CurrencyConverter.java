package utils;

public class CurrencyConverter {
	
	public static final double DOLLAR_PRICE = 3.10;
	
	public static double AmountInReais(double dollar) {
		return dollar * DOLLAR_PRICE + (dollar * DOLLAR_PRICE * 6 / 100);
	}
}
