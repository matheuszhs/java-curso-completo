package controllers;

import java.util.Scanner;

public class IfElseIf {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type the grade:");
    double grade = sc.nextDouble();

    if(grade < 0 || grade >10) {
      System.out.println("Invalid grade!");
    } else if (grade >= 8.1) {
      System.out.println("Concept A");
      System.out.println("Congratulation!!!");
    } else if (grade >= 6.1) {
      System.out.println("Concept B");
    } else if (grade >= 4.1) {
      System.out.println("Concept C");
    } else if (grade >= 2.1) {
      System.out.println("Concept D");
    } else {
      System.out.println("Concept E");
    }


    System.out.println("End!");
    sc.close();
  }
}
