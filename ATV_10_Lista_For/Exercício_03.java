package ATV_10_Lista_For;

import java.util.Random;

public class Exercício_03 {
    public static void main(String[] args) {
        Random random = new Random();
        double prod,dia= 30,media,soma=0;
        for (int x = 0; x <= dia; x++) {
            prod = random.nextInt(1000);
            System.out.println("A produção diária do dia " + x + " foi: " + prod);
            soma += prod;
        }
        System.out.println("A produção total é: "+soma);
        media = soma / 30;
        System.out.printf("A média é: %.2f%n", media);
    }
}

