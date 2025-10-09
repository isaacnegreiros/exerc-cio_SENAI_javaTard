package atv11pipi;

import java.util.Random;

public class atv5 {
    public static void main(String[] args) {
        Random r = new Random();//urgência da manutenção de uma máquina conforme
        //horas de uso (<500 baixa, 500–1000 média, >1000 alta).
        int c = r.nextInt(1300);
        if (c < 500) {
            System.out.println("baixa");
        } else {
            if (c > 500 && c < 1000) {
                System.out.println("media");
            } else {
                if (c > 100) {
                    System.out.println("alta");
                }
            }
        }
    }
}



