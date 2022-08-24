package fundamentals.operators;

public class Relational {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a'; // relational char 'a' int value

        System.out.println(a == b);
        System.out.println('\u0061');

        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);
        System.out.println(30 != 7);

        double grade = 7.3;
        boolean goodBehavior = true;
        boolean mediaApproved = grade >= 7;

        boolean haveSale = goodBehavior && mediaApproved;

        System.out.println("Have sale? " + haveSale);
    }
}
