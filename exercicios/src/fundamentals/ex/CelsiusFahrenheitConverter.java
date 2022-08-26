package fundamentals.ex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CelsiusFahrenheitConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degrees in Celsius: ");
        BigDecimal cValue = sc.nextBigDecimal();

        // C = (F - 32) * 5 / 9
        BigDecimal fValue = cValue
                .multiply(new BigDecimal(9).divide(new BigDecimal(5), 2, RoundingMode.HALF_UP))
                .add(new BigDecimal(32));

        System.out.printf("%.2f°C is equals %.2f°F", cValue, fValue);

        sc.close();
    }
}
