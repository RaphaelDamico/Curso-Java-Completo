package com.udemy.javaCursoCompleto.exerciciosEstruturaSequencial;

import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, 
//e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159


public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		final double Pi = 3.14159;
		double area = Pi * Math.pow(raio, 2);
		System.out.printf("%f * %.2f² = %.4f", Pi, raio, area);
		
		
		sc.close();
	}
}
