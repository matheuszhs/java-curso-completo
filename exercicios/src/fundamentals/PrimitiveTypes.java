package fundamentals;

import static java.lang.System.out;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // Employee data

        // Numeric types -> integer
        byte enterpriseYears = 23;
        short flyNumbers = 542;
        int id = 56789;
        long accumulatedPoints = 3_234_845_223L;

        // Numeric types -> real
        float order = 11_445.44F;
        double accumulatedSells = 2_991_797_103.01;

        // Boolean types
        boolean isInVacation = false; // true

        // Char types
        char status = 'A'; //active

        // Enterprise Days
        out.println(enterpriseYears * 365);

        // Fly numbers
        out.println(flyNumbers / 2);

        // Point/real
        out.println(accumulatedPoints / accumulatedSells);

        out.println(id + ": have order -> " + order);
        out.println("Vacation? " + isInVacation);
        out.println("Status: " + status);
    }
}
