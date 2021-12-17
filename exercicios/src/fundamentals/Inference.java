package fundamentals;

import static java.lang.System.out;

public class Inference {

    public static void main(String[] args) {
        double a = 4.5; // declare and initialize
        out.println(a);

        // a = "...";

        var b = 4.5;
        out.println(b);

        var c = "String";
        out.println(c);

        c = "Other String";
        out.println(c);

        // c = 4.5;

        double d; // declare
        d = 123.45; // initialize
        out.println(d); // used

        var e = 123.45; // required declare and initialize
        out.println(e);

        var f = 13; // integer
        // f = 12.01;  error
        out.println(f);
    }
}
