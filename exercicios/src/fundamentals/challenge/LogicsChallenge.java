package fundamentals.challenge;

public class LogicsChallenge {

    public static void main(String[] args) {
        // Work on tuesday (T or F)
        // Work on thursday (T or F)
        // 1. If work1 and work2 are true we buy a TV 51' on the weekend
        // 2. If only one of 2 works is true we buy a TV 32'
        // 3. If buy TV 32' or TV 51', we are going to eat ice cream
        // 4. If work1 and work2 is false, we are going to stay home
        // 5. If not eat ice cream, we get healthier

        boolean tueWork = false;
        boolean thuWork = false;

        boolean buyTv51 = tueWork && thuWork;
        boolean buyTv32 = tueWork ^ thuWork;

        boolean iceCream = buyTv51 || buyTv32;
        boolean healthier = !iceCream;

        System.out.printf("Comprou a TV de 51'? %s%n", buyTv51);
        System.out.printf("Comprou a TV de 32'? %s%n", buyTv32);
        System.out.printf("Tomou sorvete? %s%n", iceCream);
        System.out.printf("Ficou saldável? %s%n%n", healthier);

        // Class solution
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = comprouTv50 || comprouTv32;

        // Operador unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou sorvete? " + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
