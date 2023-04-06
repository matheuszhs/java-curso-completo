package controllers.challenge;

public class ForChellenge {

    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // Challenge version
        // You can't use numeric value to control the for!
        for (String i = "#"; !i.equals("######"); i += "#"){
            System.out.println(i);
        }

        // Class resolution
        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
