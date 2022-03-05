package fundamentals;

import static java.lang.System.out;

public class Arithmetic {

    public static void main(String[] args) {
        out.println(2 + 5);

        var x = 34.56;
        double y = 2.2;

        out.println(x + y); // Sum
        out.println(x - y); // Subtract
        out.println(x * y); // Multiply
        out.println(x / y); // Division

        int a = 8;
        int b = 3;
        out.println(a + b); // Sum
        out.println(a - b); // Subtract
        out.println(a * b); // Multiply
        out.println(a / b); // Division
        out.println(a / (double) b); // Division
        out.println(a / (float) b); // Division

        out.println(8 % 3); // Mod
        out.println(a % b); // Mod

        out.println(x + y - a * b);
    }
}
