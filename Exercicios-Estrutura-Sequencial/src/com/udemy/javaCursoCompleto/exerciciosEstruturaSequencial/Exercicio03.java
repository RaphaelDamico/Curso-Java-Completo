package com.udemy.javaCursoCompleto.exerciciosEstruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: 
//DIFERENCA = (A * B - C * D).

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o valor de D: ");
		d = sc.nextInt();
		sc.nextLine();
		
		int diferenca = (a * b - c * d);
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();
	}

}
