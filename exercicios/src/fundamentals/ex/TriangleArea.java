package fundamentals.ex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value: ");
        BigDecimal b = sc.nextBigDecimal();

        System.out.println("Enter height value: ");
        BigDecimal h = sc.nextBigDecimal();

        // A = (1/2) * b * h
        BigDecimal a = new BigDecimal("0.5")
                        .multiply(b).multiply(h);

        System.out.printf("Area = %.2f", a);

        sc.close();
    }
}
