package ATV_10_Lista_For;

import java.util.Random;

public class Exercício_02 {
    public static void main(String[] args) {
        Random random = new Random();
        double temp,min= 720,media,soma=0;
        for (int x = 0; x <= min; x++) {
            temp = random.nextInt(720);
            System.out.println("A temperatura do forno no minuto " + x + " é igual a: " + temp);
            soma += temp;
        }
        media = soma / 720;
        System.out.printf("A média é: %.2f%n", media);
    }
}
