package controllers.exercicies;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		 * 10 e é par;
		 */

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (number >= 0 && number <= 10) {
			if (number % 2 == 0) {
				System.out.printf("The number %d is between 0 and 10 and is pair%n", number);
			} else {
				System.out.printf("The number %d is between 0 and 10 and is odd%n", number);
			}
		} else {
			System.out.printf("The number %d is not between 0 and 10%n", number);
		}

		sc.close();
	}
}
