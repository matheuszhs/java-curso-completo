package fundamentals;

import java.util.Scanner;

public class StringTypesEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2"); // compare objects

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1)); // compare content

        Scanner sc = new Scanner(System.in);

        String s2 = sc.nextLine();
        System.out.println(s2);
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        sc.close();
    }
}
