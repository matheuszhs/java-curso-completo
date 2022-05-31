package fundamentals.challenge;

import static java.lang.Math.pow;
import static java.lang.System.Logger.Level.DEBUG;
import static java.lang.System.Logger.Level.INFO;

import java.lang.System.Logger;

public class ArithmeticChallenge {

    private static final Logger LOGGER = System.getLogger("f.c.ArithmeticChallenge");
    public static void main(String[] args) {
        int a = 3 * 4 - 10;
        int b = (int) pow(a, 3);
        double c = pow(a, 3);

        LOGGER.log(DEBUG, b);
        LOGGER.log(DEBUG, c);

        // My solution

        double x1 = 6 * (3 + 2);
        double x = pow(x1, 2) / (3 * 2);

        double y2 = (1 - 5) * (2 - 7) / 2.0;
        double y = pow(y2, 2);

        double totalXY = pow((x - y), 3);
        double div = pow(10, 3);

        double total = totalXY / div;

        LOGGER.log(INFO, String.format("Total = %.0f", total));

        // Class solution
        double numA = pow(6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1-5) * (2-7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = pow(numB / denB, 2);

        double superior = pow(superiorA - superiorB, 3);
        double inferior = pow(10, 3);

        double resultado = superior / inferior;

        LOGGER.log(INFO,String.format("O resultado = %.0f", resultado));
    }
}
