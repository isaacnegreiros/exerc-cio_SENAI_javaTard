package atv11pipi;

import java.util.Random;

public class atv8 {
    public static void main(String[] args) {
        Random r = new Random(40);
        int c = r.nextInt();//Decida se o material de impressão deve ser trocado conforme quantidade
        // restante: <20% trocar, senão continuar.
        if (c<20){
            System.out.println("trocar");
        } else if (c>20) {
            System.out.println("continuar");
        }
    }
}
