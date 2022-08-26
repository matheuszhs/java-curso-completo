package fundamentals.ex;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        BigDecimal a = sc.nextBigDecimal();

        System.out.println("Enter B value: ");
        BigDecimal b = sc.nextBigDecimal();

        System.out.println("Enter C value: ");
        BigDecimal c = sc.nextBigDecimal();

        System.out.printf("%.0fx2 + %.0fx + %.0f = 0%n", a, b, c);

        // d = b^2 - 4 * a * c
        BigDecimal delta = b.pow(2).subtract(new BigDecimal(4).multiply(a).multiply(c));

        BigDecimal x1 = b.negate().add(delta.sqrt(MathContext.DECIMAL32)).divide(new BigDecimal(2).multiply(a), 0, RoundingMode.HALF_EVEN);
        BigDecimal x2 = b.negate().subtract(delta.sqrt(MathContext.DECIMAL32)).divide(new BigDecimal(2).multiply(a), 0, RoundingMode.HALF_EVEN);

        System.out.printf("S = {%.0f, %.0f}", x1, x2);
        sc.close();
    }
}
