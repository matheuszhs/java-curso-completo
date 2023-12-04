package controllers.exercicies;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */

		Scanner sc = new Scanner(System.in);

		int tentativas;
		int numeroAleatorio;
		int numero;
		int parar;

		do {
			System.out.println("Um número entre 0 e 100 foi sorteado... \n");
			Random random = new Random();
			numeroAleatorio = random.nextInt(101);

			tentativas = 10;
			do {
				System.out.printf("Voce tem %d tentativas!%n", tentativas);
				numero = sc.nextInt();
				tentativas--;

				if (numero > numeroAleatorio) {
					System.out.printf("%nO numero sorteado e menor que %d%n%n", numero);
				} else if (numero < numeroAleatorio) {
					System.out.printf("%nO numero sorteado e maior que %d%n%n", numero);
				} else {
					System.out.printf("%nParabens! Voce acertou o numero restando %d tentativas!%n%n", tentativas);
					break;
				}
				
			} while (tentativas != 0);

			

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			parar = sc.nextInt();

		} while (parar != 0);

		sc.close();

	}
}
