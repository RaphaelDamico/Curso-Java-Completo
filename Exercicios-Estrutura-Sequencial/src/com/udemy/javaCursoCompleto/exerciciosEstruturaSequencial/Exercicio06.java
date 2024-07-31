package com.udemy.javaCursoCompleto.exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de
//dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double areaTrianguloRetangulo;
		final double Pi = 3.14159;
		double areaDoCirculo;
		double areaDoTrapezio;
		double areaDoQuadrado;
		double areaDoRetangulo;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		sc.nextLine();
		
		areaTrianguloRetangulo = (a * c) / 2;
		System.out.printf("a) A área do triângulo retângulo que tem A por base e C por altura: %.3f%n%n", areaTrianguloRetangulo);
		
		areaDoCirculo = Pi * Math.pow(c, 2);
		System.out.printf("b) A área do círculo de raio C: %.3f%n%n", areaDoCirculo);
		
		areaDoTrapezio = (a + b) * c / 2;
		System.out.printf("c) A área do trapézio que tem A e B por bases e C por altura: %.3f%n%n", areaDoTrapezio);
		
		areaDoQuadrado = Math.pow(b, 2);
		System.out.printf("d) A área do quadrado que tem lado B: %.3f%n%n", areaDoQuadrado);
		
		areaDoRetangulo = a * b;
		System.out.printf("e) A área do retângulo que tem lados A e B: %.3f", areaDoRetangulo);
		
		sc.close();

	}

}
