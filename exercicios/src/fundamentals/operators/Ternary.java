package fundamentals.operators;

public class Ternary {

    public static void main(String[] args) {
        double avg = 7.6;
        String resultadoParcial = avg >= 5.0 ? "em recuperação." : "reprovado.";
        String resultado = avg >= 7.0 ? "aprovado." : resultadoParcial;

        System.out.println("O aluno está " + resultado);

        double grade = 7.3;
        boolean goodBehavior = true;
        boolean mediaApproved = grade >= 7;

        String haveSale = goodBehavior && mediaApproved ? "Yes" : "No";

        System.out.printf("Have sale? %s", haveSale);

    }
}
