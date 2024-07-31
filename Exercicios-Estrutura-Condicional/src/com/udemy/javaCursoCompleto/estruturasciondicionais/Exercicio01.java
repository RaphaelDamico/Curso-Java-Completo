package com.udemy.javaCursoCompleto.estruturasciondicionais;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro,
//e depois dizer se este número é negativo ou não.

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero < 0)
			System.out.print("NEGATIVO");
		else 
			System.out.print("NAO NEGATIVO");
		
		sc.close();
	}

}
