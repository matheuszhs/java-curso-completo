package controllers.exercicies;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		/*
		 * 8. Criar um programa que receba uma palavra e imprime no console letra por
		 * letra.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		sc.close();
	}
}
