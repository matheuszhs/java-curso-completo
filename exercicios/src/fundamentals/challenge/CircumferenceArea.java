package fundamentals.challenge;

import static java.lang.System.out;

public class CircumferenceArea {

    public static void main(String[] args) {
        double r = 3.4;
        final double PI = 3.14159;

        double area = PI * r * r;
        out.println(area);

        r = 10;
        area = PI * r * r;
        out.println("Area = " + area + "m2.");
    }
}
