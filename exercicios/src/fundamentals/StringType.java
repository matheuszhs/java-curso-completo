package fundamentals;

import static java.lang.System.out;

public class StringType {

    public static void main(String[] args) {
        out.println("Hello guys".charAt(2));

        String s = "Good afternoon";
        s = s.toUpperCase();
        s = "Good morning"; // Replace but not modified
        out.println(s.concat("!!!"));
        out.println(s + "!!!");
        out.println(s.startsWith("Good"));
        out.println(s.toLowerCase().startsWith("good"));
        out.println(s.toUpperCase().endsWith("MORNING"));
        out.println(s.length());
        out.println(s.toLowerCase().equals("good morning"));
        out.println(s.equalsIgnoreCase("good morning"));

        var name = "Matheus";
        var lastName = "Souza";
        var age = 25;
        var order = 12_345.987;

        String anySentence = "Name: " + name
                + "\nLast Name: " + lastName
                + "\nAge: " + age
                + "\nOrder: " + order + "\n";
        out.println(anySentence);

        out.printf("Mr %s %s have %d years and receive %.2f €.", name, lastName, age, order);

        String sentence = String.format("%nMr %s %s have %d years and receive %.2f €.", name, lastName, age, order);
        out.println(sentence);

        out.println("Any sentence".contains("sent"));
        out.println("Any sentence".indexOf("sent"));
        out.println("Any sentence".substring(4));
        out.println("Any sentence".substring(4, 8));
    }
}
