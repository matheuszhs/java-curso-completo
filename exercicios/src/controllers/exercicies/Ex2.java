package controllers.exercicies;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 2. Criar um programa informa se o ano atual é um ano bissexto;
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digit the year: ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a bissexto");
        } else {
            System.out.println(year + " is not a bissexto");
        }
		sc.close();
	}
}
