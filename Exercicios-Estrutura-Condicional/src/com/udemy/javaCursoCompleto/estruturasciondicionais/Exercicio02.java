package com.udemy.javaCursoCompleto.estruturasciondicionais;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e 
//dizer se este número é par ou ímpar.

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero%2 == 0)
			System.out.print("PAR");
		else 
			System.out.print("IMPAR");
		
		sc.close();
	}

}
