package com.udemy.javaCursoCompleto.exerciciosEstruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1,
//o número de peças 1, o valor unitário de cada peça 1,
//o código de uma peça 2, o número de peças 2 e o valor
//unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1;
		int numeroDePecas1;
		double valorUnitarioPeca1;
		int codigoPeca2;
		int numeroDePecas2;
		double valorUnitarioPeca2;
		double valorTotal;
		
		System.out.print("Digite o código da primeira peça: ");
		codigoPeca1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Quantidade: ");
		numeroDePecas1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor unitário: ");
		valorUnitarioPeca1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite o código da segunda peça: ");
		codigoPeca2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Quantidade: ");
		numeroDePecas2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor unitário: ");
		valorUnitarioPeca2 = sc.nextDouble();
		sc.nextLine();
		
		valorTotal = numeroDePecas1 * valorUnitarioPeca1 + numeroDePecas2 * valorUnitarioPeca2;
		System.out.printf("VALOR A PAGAR: R$%.2f", valorTotal);
		
		sc.close();
	}

}
