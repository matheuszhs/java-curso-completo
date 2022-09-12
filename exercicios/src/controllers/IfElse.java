package controllers;

import javax.swing.JOptionPane;

public class IfElse {

  public static void main(String[] args) {
    String value = JOptionPane.showInputDialog("Type a number: ");
    Integer n = Integer.parseInt(value);

    if(n % 2 == 0) {
      System.out.println("Even number!");
    } else {
      System.out.println("Odd number!");
    }
  }
}
