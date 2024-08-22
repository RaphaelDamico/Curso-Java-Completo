package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.print("Name: ");
		s.name = sc.nextLine();
		System.out.print("First trim grade: ");
		s.firstTrimGrade = sc.nextDouble();		
		System.out.print("Second trim grade: ");
		s.secondTrimGrade = sc.nextDouble();		
		System.out.print("Third trim grade: ");
		s.thirdTrimGrade = sc.nextDouble();
		System.out.println();
		
		System.out.println(s);
		
		sc.close();
	}
}
