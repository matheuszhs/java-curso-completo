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

        BigDecimal total =
                op.equals("+") ? n1.add(n2) :
                        op.equals("-") ? n1.subtract(n2) :
                                op.equals("*") ? n1.multiply(n2) :
                                        op.equals("/") ? n1.divide(n2, 2, RoundingMode.HALF_UP) :
                                                op.equals("%") ? n1.remainder(n2) : new BigDecimal("0");

        System.out.printf("%.2f %s %.2f = %.2f %n%n", n1, op, n2, total);

        // Class solution
        System.out.println("Informe o número: ");
        double num1 = sc.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = sc.nextDouble();

        System.out.println("Informe a operação: ");
        String ope = sc.next();

        // Lógica
        double resultado = "+".equals(ope) ? num1 + num2 : 0;
        resultado = "-".equals(ope) ? num1 - num2 : resultado;
        resultado = "*".equals(ope) ? num1 * num2 : resultado;
        resultado = "/".equals(ope) ? num1 / num2 : resultado;
        resultado = "%".equals(ope) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, ope, num2, resultado);

        sc.close();
    }
}
