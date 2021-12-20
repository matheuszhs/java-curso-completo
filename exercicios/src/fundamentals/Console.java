package fundamentals;

import static java.lang.System.out;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        out.print("Good");
        out.print(" morning!\n");

        out.println("Good");
        out.println("morning!");

        out.printf("Luck numbers: %d %d %d %d %d %d%n",
                1, 2, 3, 4, 5, 6);
        out.printf("Order: %.1f%n", 1234.5678);
        out.printf("Name: %s%n", "Matheus");

        Scanner sc = new Scanner(System.in);

        out.print("What's your first name? ");
        String name = sc.nextLine();

        out.print("What's your last name? ");
        String lastName = sc.nextLine();

        out.print("How old are you? ");
        int age = sc.nextInt();

        out.printf("%n%s %s is %d years old.", name, lastName, age);
        sc.close();
    }
}
