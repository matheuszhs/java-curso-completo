package fundamentals.challenge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculatorChallenge {

    public static void main(String[] args) {
        // Read number 1
        // Read number 2
        // + - * / %
        // Operation 1 and 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number 1: ");
        BigDecimal n1 = sc.nextBigDecimal();

        System.out.println("Type number 2: ");
        BigDecimal n2 = sc.nextBigDecimal();

        System.out.println("Type the operation: ");
        String op = sc.next();

        BigDecimal total = null;
        switch (op) {
            case "+":
                total = n1.add(n2);
                break;
            case "-" :
                total = n1.subtract(n2);
                break;
            case "*":
                total = n1.multiply(n2);
                break;
            case "/":
                total = n1.divide(n2, 2, RoundingMode.HALF_UP);
                break;
            case "%":
                total = n1.remainder(n2);
                break;
        }

        System.out.printf("%nTotal: %.2f", total);
    }
}
