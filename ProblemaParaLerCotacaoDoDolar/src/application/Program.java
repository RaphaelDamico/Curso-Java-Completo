package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

//Faça um programa para ler a cotação do dólar e depois um valor em dólares
//a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares,
//considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
//para ser responsável pelos cálculos.

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? $ %.2f%n%n", CurrencyConverter.DOLLAR_PRICE);
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Amount to be paid in reais = R$ %.2f", CurrencyConverter.AmountInReais(dollar) );
		
		
		
		sc.close();

	}

}
