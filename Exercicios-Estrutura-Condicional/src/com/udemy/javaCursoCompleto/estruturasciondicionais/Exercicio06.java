package com.udemy.javaCursoCompleto.estruturasciondicionais;

import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer
//e apresente uma mensagem dizendo em qual dos seguintes
//intervalos ([0,24], (25,49], (50,74], (75,100]) este valor
//se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem
//“Fora de intervalo”.

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite qualquer valor: ");
		double valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100) 
			System.out.println("Fora de intervalo");
		else if(valor < 25)
			System.out.println("[0,24]");
		else if(valor < 50)
			System.out.println("[25,49]");
		else if(valor < 75)
			System.out.println("[50,74]");
		else 
			System.out.println("[75,100]");
		
		sc.close();
	}

}
