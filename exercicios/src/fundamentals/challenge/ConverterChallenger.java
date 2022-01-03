package fundamentals.challenge;

import static java.lang.System.out;

import java.util.Scanner;

public class ConverterChallenger {

    // With Scanner get 3 String and receive the last 3 salaries of employee
    // The employee can separate decimal with . or ,
    // Sum the 3 salaries and return the average
    public static void main(String[] args) {

        // My resolution
        Scanner sc = new Scanner(System.in);
        out.println("Type the salary number 1: ");
        double n1 = Double.parseDouble(sc.nextLine().replace(",", "."));

        out.println("Type the salary number 2: ");
        double n2 = Double.parseDouble(sc.nextLine().replace(",", "."));

        out.println("Type the salary number 3: ");
        double n3 = Double.parseDouble(sc.nextLine().replace(",", "."));

        double avg = (n1 + n2 + n3) / 3;

        out.printf("The employee's average salary is $ %.2f", avg);


        // Class resolution
        out.print("\n\nType the first salary: ");
        String value1 = sc.next().replace(",", ".");

        out.print("Type the second salary: ");
        String value2 = sc.next().replace(",", ".");

        out.print("Type the third salary: ");
        String value3 = sc.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double average = (salary1 + salary2 + salary3) / 3;
        out.println("The average of salaries is $ " + average);

        sc.close();
    }
}
