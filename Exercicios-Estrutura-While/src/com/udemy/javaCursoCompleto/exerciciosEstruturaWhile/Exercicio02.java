package com.udemy.javaCursoCompleto.exerciciosEstruturaWhile;

import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
//indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
//o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
//menos uma de duas coordenadas for NULA (nesta situação sem escrever
//mensagem alguma).

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a coordenada X: ");
		int x = sc.nextInt();
		System.out.print("Digite a coordenada Y: ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			System.out.print("Digite a coordenada X novamente: ");
			x = sc.nextInt();
			System.out.print("Digite a coordenada Y novamente: ");
			y = sc.nextInt();
		}
		sc.close();
	}
}
