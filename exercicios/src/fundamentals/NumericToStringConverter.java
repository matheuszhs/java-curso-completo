package fundamentals;

import static java.lang.System.out;

public class NumericToStringConverter {


    public static void main(String[] args) {
        Integer num1 = 10000;
        out.println(num1.toString().length());

        int num2 = 100000;
        out.println(Integer.toString(num2).length());

        out.println(("" + num1).length());
        out.println(("" + num2).length());
    }
}
