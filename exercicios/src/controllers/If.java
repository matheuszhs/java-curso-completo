package controllers;

import java.util.Scanner;

public class If {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter average grade: ");
    double avg = sc.nextDouble();

    if (avg <= 10 && avg >= 7.0) {
      System.out.println("Approved!");
      System.out.println("Congratulation!");
    }

    if (avg < 7 && avg >= 4.5) {
      System.out.println("Have hope!");
    }

    boolean  isWithoutHope= avg < 4.5 && avg >= 0;
    if (isWithoutHope)  {
      System.out.println("Oh no!");
    }

    sc.close();
  }
}
