package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
//	Fazer um programa para ler um número inteiro N e os dados(nome e preço)
//	de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] p = new Product[n];
		
		for(int i = 0; i < p.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			p[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < p.length; i++) {
			sum += p[i].getPrice();
		}
		
		double avg = sum / p.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
