package fundamentals.ex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with your weight: ");
        BigDecimal w = sc.nextBigDecimal();

        System.out.println("Enter with your height: ");
        BigDecimal h = sc.nextBigDecimal();

        // imc = weight / (height * height)
        BigDecimal imc = w.divide(h.multiply(h), 2, RoundingMode.HALF_UP);

        System.out.printf("IMC is equals %.2f", imc);

        sc.close();
    }
}
