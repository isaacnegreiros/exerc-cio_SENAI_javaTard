package eucasa;

import java.util.Random;

public class atv7 {
    static void main() {
        Random ra = new Random();
        int armazenar = 0, maq = 10, media = 0, r = 0;
        for (int x = 0; x <= maq; x++) {
            r = ra.nextInt(55);
            System.out.println("A maquina " + x + " gastou o tempo de " + r + " minuto para fazer a soldagem");
            armazenar +=r;
        }
        media = armazenar / 10;
        System.out.println("o tempo medio foi de :"+media);

    }
}
