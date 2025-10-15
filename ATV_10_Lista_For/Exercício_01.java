package ATV_10_Lista_For;

import java.util.Random;

public class Exercício_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int ef, maq = 100;
        double media,soma = 0;
        for (int x = 0; x <= maq; x++) {
            ef = random.nextInt(100);
            System.out.println("A eficiência da maquina " + x + " é igual a: " + ef);
            soma += ef;
        }
        media = soma / 100;
        System.out.println("A média é: " + media);

    }
}
