package controllers;

public class For1 {

  public static void main(String[] args) {
    for (int count = 0; count <= 20; count += 2) {
      System.out.printf("Count = %d%n", count);
    }

    int x = 2;
    for (; x < 10; ) {
      System.out.printf("X = %d%n", x);
      x++;
    }

    // Infinite Loop
    //for (;;) {
    //System.out.println("End!");
    //}
  }
}
