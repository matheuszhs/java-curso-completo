package controllers.challenge;

import java.util.Scanner;

public class WeekDays {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter week day:");
    String weekDay = sc.next();

    if (weekDay.equalsIgnoreCase("Sunday")) {
      System.out.println(1);
    } else if (weekDay.equalsIgnoreCase("Monday")) {
      System.out.println(2);
    } else if (weekDay.equalsIgnoreCase("Tuesday")) {
      System.out.println(3);
    } else if (weekDay.equalsIgnoreCase("Wednesday")) {
      System.out.println(4);
    } else if (weekDay.equalsIgnoreCase("Thursday")) {
      System.out.println(5);
    } else if (weekDay.equalsIgnoreCase("Friday")) {
      System.out.println(6);
    } else if (weekDay.equalsIgnoreCase("Saturday")) {
      System.out.println(7);
    } else {
      System.out.println("Invalid week day!");
    }

    System.out.println("End!");

    sc.close();
  }
}
