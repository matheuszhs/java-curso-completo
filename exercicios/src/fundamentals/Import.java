package fundamentals;

import static java.lang.System.out;

import java.util.Date;

public class Import {

    public static void main(String[] args) {
        java.lang.String b = "Good Morning!";
        java.lang.System.out.println(b);

        String s = "Good Morning!";
        out.println(s);

        Date d = new Date();
        out.println(d);

        // JButton button = new JButton();
    }
}
