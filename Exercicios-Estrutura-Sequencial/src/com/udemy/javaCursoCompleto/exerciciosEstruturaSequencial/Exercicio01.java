package com.udemy.javaCursoCompleto.exerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
	
//	Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//	mensagem explicativa, conforme exemplos.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = x + y;
		System.out.printf("%d + %d = %d", x, y, soma);
		
		
		sc.close();

	}

}
