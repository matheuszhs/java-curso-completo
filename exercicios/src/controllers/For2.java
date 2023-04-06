package controllers;

public class For2 {

  public static void main(String[] args) {
    for (int i = 10; i >= 0; i-=2) {
      System.out.printf("Count = %d%n",i);
    }

    // class solution
    for (int contador = 10; contador >= 0; contador -=2) {
      System.out.printf("Contador = %d%n", contador);
    }
  }

}
