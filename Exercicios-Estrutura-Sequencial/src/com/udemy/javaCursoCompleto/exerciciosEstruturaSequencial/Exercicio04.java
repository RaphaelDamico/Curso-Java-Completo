package com.udemy.javaCursoCompleto.exerciciosEstruturaSequencial;

import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário,
//com duas casas decimais.

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		double horasTrabalhadas;
		double valorRecebidoPorHora;
		double salario;
		
		System.out.print("Digite o número do funcionário: ");
		numeroFuncionario = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite o valor recebido por hora: ");
		valorRecebidoPorHora = sc.nextDouble();
		sc.nextLine();
		
		salario = horasTrabalhadas * valorRecebidoPorHora;
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", numeroFuncionario, salario);
		
		
		sc.close();
	}

}
