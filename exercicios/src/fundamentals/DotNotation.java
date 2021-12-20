package fundamentals;

import static java.lang.System.out;

public class DotNotation {

    public static void main(String[] args) {
        String s = "Good Morning X";
        s = s.replace("X", "Sir");
        s = s.toUpperCase();
        s = s.concat("!!!");

        out.println(s);

        String x = "Matheus".toUpperCase();
        out.println(x);

        String y = "Good Morning X"
                .replace("X", "Maria")
                .toUpperCase()
                .concat("!!!");
        out.println(y);

        // Primitive types not have dot operator "."
        int a = 3;
        // a. not exist
        out.println(a);
    }
}
