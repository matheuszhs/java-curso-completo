package controllers.challenge;

import java.util.Scanner;

public class WhileChallenge {

  public static void main(String[] args) {
    // Type a valid grade
    // If valid grade is type add valid grade +1
    // sum total if is valid
    // -1 exit program and calculate average

    Scanner sc = new Scanner(System.in);

    double num = 0, total = 0;
    int count = 0;

    while (num != -1.0) {
      System.out.print("Type a grade please (or -1 to exit): ");
      num = sc.nextDouble();
      if (num >= 0 && num <= 10) {
        total += num;
        count++;
      } else if (num != -1) {
        System.out.print("Not a valid grade... ");
      }
    }

    double avg = total / count;
    System.out.printf("Average is: %.2f", avg);

    sc.close();
  }

}
