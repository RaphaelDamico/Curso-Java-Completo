package com.udemy.javaCursoCompleto.estruturasciondicionais;

import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que
//leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo = 0;
		int quantidade;
		double valor = 0;

		System.out.print("Digite o código do produto: ");
		codigo = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		quantidade = sc.nextInt();

		switch (codigo) {
		case 1:
			valor = 4.00 * quantidade;
			break;
		case 2:
			valor = 4.50 * quantidade;
			break;
		case 3:
			valor = 5.00 * quantidade;
			break;
		case 4:
			valor = 2.00 * quantidade;
			break;
		case 5:
			valor = 1.50 * quantidade;
			break;
		default:
			System.out.println("Código inválido");
			sc.close();
			return;
		}
		System.out.printf("Total: R$%.2f", valor);

		sc.close();
	}

}
