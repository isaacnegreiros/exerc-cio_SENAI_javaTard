package atv11pipi;

import java.util.Random;

public class atv9 {
    public static void main(String[] args) {
        Random r = new Random();//índice de defeito do lote > 10%, acione alerta; se ≤10%, lote
        //aprovado.
        int c = r.nextInt(25);
        if (c > 10) {
            System.out.println("acione a alerta");
        } else {
            if (c <= 10) {
                System.out.println("aprovado");
            }
        }

    }
}
