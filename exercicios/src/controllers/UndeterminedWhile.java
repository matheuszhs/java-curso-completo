package controllers;

import java.util.Scanner;

public class UndeterminedWhile {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = "";
    while (!value.equalsIgnoreCase("exit")) {
      System.out.print("You say: ");
      value = sc.nextLine();
    }

    System.out.println("End!");

    sc.close();
  }
}
