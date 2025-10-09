package atv11pipi;

import java.util.Random;

public class atv10 {
    public static void main(String[] args) {
        Random random = new Random();
        int temp = random.nextInt(70);
        if (temp <= 0) {
            System.out.println("Alerta: Congelamento");
        } else {
            if (temp > 0 && temp < 40) {
                System.out.println("Temperatura Normal");
            } else if (temp >= 40) {
                System.out.println("Alerta: Superaquecimento");

            }
        }
    }
}
