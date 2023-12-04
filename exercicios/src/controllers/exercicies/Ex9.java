package controllers.exercicies;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		/*
		 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		 */
		int maiorValor = 0;
		int contador = 0;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();

	}
}
