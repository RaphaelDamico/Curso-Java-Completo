package com.udemy.javaCursoCompleto.estruturasciondicionais;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa
//deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
//indicando se os valores lidos são múltiplos entre si. 
//Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		sc.nextLine();
		
		if(a%b == 0)
			System.out.print("SAO MULTIPLOS");
		else if(b%a == 0)
			System.out.print("SAO MULTIPLOS");
		else 
			System.out.print("NAO SAO MULTIPLOS");
		
		sc.close();
	}

}
