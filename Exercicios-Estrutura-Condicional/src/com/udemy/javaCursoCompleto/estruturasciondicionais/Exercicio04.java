package com.udemy.javaCursoCompleto.estruturasciondicionais;

import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo.
//A seguir calcule a duração do jogo, sabendo que
//o mesmo pode começar em um dia e terminar em outro,
//tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horaInicial;
		double horaFinal;
		double duracao;
		
		System.out.print("Digite a hora inicial do jogo: ");
		horaInicial = sc.nextDouble();
		sc.nextLine();
		System.out.print("Digite a hora final do jogo: ");
		horaFinal = sc.nextDouble();
		sc.nextLine();
		
		if(horaFinal < horaInicial)
			duracao = 24 - horaInicial + horaFinal;
		else
			duracao = horaFinal - horaInicial;
		
		System.out.printf("Duracao: %.2f horas de jogo.", duracao);
		
		sc.close();
	}

}
