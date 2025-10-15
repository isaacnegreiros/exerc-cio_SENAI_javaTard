package ATV_10_Lista_For;

import java.util.Random;

public class Exercício_04 {
    public static void main(String[] args) {
        Random random = new Random();
        double prod = 0,produto= 200,media,soma=0, p1=0;
        for (int x = 0; x <= produto; x++) {
            prod = random.nextInt(100);
            System.out.println("A produção diária do dia " + x + " foi: " + prod);
            soma += prod;
        }
        System.out.println("número de peças defeituosas: "+soma);
        media = soma / 100;
        p1 = prod/200;
        System.out.println("Porcentagem "+p1*100+"%");
    }
}
