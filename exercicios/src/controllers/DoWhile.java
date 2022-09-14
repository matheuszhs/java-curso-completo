package controllers;

import java.util.Scanner;

public class DoWhile {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String value = "";

    do {
      System.out.println("You need say the magic word...");
      System.out.print("Do you want to go out? ");
      value = sc.nextLine();

    } while (!value.equalsIgnoreCase("please"));

    System.out.println("Thanks!!!");

    sc.close();
  }
}
