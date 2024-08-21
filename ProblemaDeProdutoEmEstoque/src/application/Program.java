package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

//Fazer um programa para ler os dados de um produto em estoque
//(nome, preço, quantidade no estoque). Em seguida:
//	- Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total no estoque)
//	- Realizar uma entrada no estoque e mostrar novamente os dados do produto
//	- Realizar uma saída no estoque e mostrar novamente os dados do produto

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + p);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		Integer quantity = sc.nextInt();
		p.addProducts(quantity);
		System.out.println();
		System.out.print("Updated data: " + p);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity =sc.nextInt();
		p.removeProducts(quantity);
		System.out.println();
		System.out.print("Updated data: " + p);
		
		sc.close();
	}

}
