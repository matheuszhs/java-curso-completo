package fundamentals;

import static java.lang.System.out;

import javax.swing.JOptionPane;

public class StringToNumericConverter {

    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog("Type the first number:");
        String value2 = JOptionPane.showInputDialog("Type the second number:");

        out.println(value1 + value2);

        double num1 = Double.parseDouble(value1);
        double num2 = Double.parseDouble(value2);

        double sum = num1 + num2;
        out.println("The sum is " + sum);
        out.println("The average is " + sum / 2);
    }
}
