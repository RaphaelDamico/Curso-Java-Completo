package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

//	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
//	Depois, mostrar na tela a altura média das pessoas e mostrar também a porcentagem de
//	pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		String[] names = new String[n];
		Integer[] ages = new Integer[n];
		double[] heights = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Data of person number " + (i + 1) + ": ");
			System.out.print("Name: ");
			names[i] = sc.next();
			System.out.print("Age: ");
			ages[i] = sc.nextInt();
			System.out.print("Height: ");
			heights[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += heights[i];
		}
		double avg = sum / n;
		System.out.println();
		System.out.printf("Average height: %.2f%n", avg);
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(ages[i] < 16)
				count += 1;
		}
		
		double percent = count * 100.0 / n;
		System.out.printf("People under 16: %.1f%%%n", percent);
		
		for (int i = 0; i < n; i++) {
			if(ages[i] < 16)
				System.out.println(names[i]);
		}
		
		sc.close();
	}

}
