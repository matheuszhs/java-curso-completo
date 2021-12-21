package fundamentals;

import static java.lang.System.out;

public class Wrappers {

    public static void main(String[] args) {

        // byte
        Byte b = 100;
        Short s = 1000;
        //Integer.parseInt(sc.nextLine());
        Integer i = 10000;
        Long l = 100000L;

        out.println(b.byteValue());
        out.println(s.toString());
        out.println(i * 3);
        out.println(l / 3);

        Float f = 123.10F;
        out.println(f);

        Double d = 1234.5678;
        out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        out.println(bo);
        out.println(bo.toString().toUpperCase());

        Character c = '#';
        out.println(c + "...");
    }
}
