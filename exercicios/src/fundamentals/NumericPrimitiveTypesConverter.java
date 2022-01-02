package fundamentals;

import static java.lang.System.out;

public class NumericPrimitiveTypesConverter {

    public static void main(String[] args) {
        double a = 1; // implicit
        out.println(a);

        float b = (float) 1.123456788888; // explicit (CAST)
        out.println(b);

        int c = 340;
        byte d = (byte) c; // explicit (CAST)
        out.println(d);

        double e = 1.9999;
        int f = (int) e; // explicit (CAST)
        out.println(f);
    }
}
