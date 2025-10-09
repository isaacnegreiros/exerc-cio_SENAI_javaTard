package atv11pipi;

import java.util.Random;

public class atv4 {
    public static void main(String[] args) {
        Random r = new Random();//Acesso:  Se for operador básico →
        //acesso restrito; se supervisor → acesso parcial; se engenheiro → acesso total.
        int c = r.nextInt(3);
        if (c == 0) {
            System.out.println("operador basico:acesso restrito");
        } else {
            if (c == 1) {
                System.out.println("supervisor:acesso parcial");
            } else {

                if (c == 2) {
                    System.out.println("engenheiro");
                }
            }
        }
    }
}



