package fundamentals.challenge;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        // Convert F to C
        // (F - 32) x 5/9 = C

        // My resolution
        final int X = 32;
        final double DELTA = 5.0/9.0;

        Scanner sc = new Scanner(in);
        out.println("Fahrenheit temperature");
        double f = sc.nextDouble();

        Double c = (f - X) * DELTA;

        out.printf("%.2f °F is equals %.2f °C.%n", f, c);

        // Class resolution
        final double FACTOR = 5.0/9.0;
        final double ADJUST = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - ADJUST) * FACTOR;
        out.println("The result is " + celsius + "°C.");

        fahrenheit = 0;
        celsius = (fahrenheit - ADJUST) * FACTOR;
        out.println("The result is " + celsius + "°C.");
    }
}
