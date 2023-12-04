package controllers.exercicies;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		/*
		 * 5. Refatorar o exercício 04, utilizando a estrutura switch.
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

		switch (count) {
		case 0:
			System.out.println("É um número primo.");
			break;
		default:
			System.out.println("Não é um número primo.");
		}

		sc.close();
	}
}
