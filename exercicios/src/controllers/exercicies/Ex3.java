package controllers.exercicies;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
		 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
		 * "Recuperação", caso contrário imprime no console "Reprovado".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.printf("Sua média %.2f foi e você está Aprovado", media);
		} else if (media < 7 && media >= 4) {
			System.out.printf("Sua média %.2f foi e você está de Recuperação", media);
		} else {
			System.out.printf("Sua média %.2f foi e você está Reprovado", media);
		}
		sc.close();
	}
}
