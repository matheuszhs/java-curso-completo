package controllers.exercicies;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		/*
		 * 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner sc = new Scanner(System.in);
		int number;
		int sum = 0;

		do {
			System.out.println("Digite um número: ");
			number = sc.nextInt();

			if (number >= 0) {
				sum = sum + number;
				System.out.printf("A soma dos números inseridos é: %d%n", sum);
			}

		} while (number >= 0);
		
		sc.close();
	}
}
