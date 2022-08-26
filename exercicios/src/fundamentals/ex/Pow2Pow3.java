package fundamentals.ex;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pow2Pow3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with a number: ");
        BigDecimal n = sc.nextBigDecimal();

        System.out.printf("%.0f power 2 is equals %.0f%n", n, n.pow(2));
        System.out.printf("%.0f power 3 is equals %.0f", n, n.pow(3));

        sc.close();
    }
}
