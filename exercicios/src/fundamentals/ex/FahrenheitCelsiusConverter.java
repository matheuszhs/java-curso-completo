package fundamentals.ex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FahrenheitCelsiusConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degrees in Fahrenheit: ");
        BigDecimal fValue = sc.nextBigDecimal();

        // C = (F - 32) * 5 / 9
        BigDecimal cValue = fValue.subtract(new BigDecimal(32))
                .multiply(new BigDecimal(5))
                .divide(new BigDecimal(9), 0, RoundingMode.HALF_UP);

        System.out.printf("%.0f°F is equals %.0f°C", fValue, cValue);

        sc.close();
    }
}
