package controllers.exercicies;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		/*
		 * 4. Criar um programa que receba um número e diga se ele é um número primo
		 */
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int number = sc.nextInt();
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("É um número primo.");
		} else {
			System.out.println("Não é um número primo.");
		}
		sc.close();
	}
}
