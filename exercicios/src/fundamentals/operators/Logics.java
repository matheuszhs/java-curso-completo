package fundamentals.operators;

import java.util.logging.Logger;

public class Logics {
    private static final Logger logger = Logger.getLogger("f.o.Logics");

    public static void main(String[] args) {
        boolean cond1 = true;
        boolean cond2 = 3 > 7;

        System.out.println(cond1 && cond2);
        System.out.println(cond1 || cond2);
        System.out.println(cond1 ^ cond2);
        System.out.println(!!cond1);
        System.out.println(!cond2);

        // Trust table AND
        System.out.println("\nTrust table AND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // Trust table OR
        System.out.println("\nTrust table OR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Trust table XOR
        System.out.println("\nTrust table XOR");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Trust table NOT
        System.out.println("\nTrust table NOT");
        System.out.println(!true);
        System.out.println(!false);


    }

}
