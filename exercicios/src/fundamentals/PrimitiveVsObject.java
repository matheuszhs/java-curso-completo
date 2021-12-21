package fundamentals;

import static java.lang.System.out;

public class PrimitiveVsObject {

    public static void main(String[] args) {
        // String s = "string";
        String s = new String("string");
        s.toUpperCase();

        // Wrappers are object version from primitive
        int a = 123;
        // a. not exist in primitive
        out.println(a);
    }
}
