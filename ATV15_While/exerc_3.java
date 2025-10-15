package atividade15;

import java.util.Random;

public class exerc_3 {//Um sensor de temperatura na fábrica mede a temperatura ambiente a cada hora.

    //Crie um programa que use o comando while para calcular a média de temperatura
    //  de 24 horas. O programa deve continuar enquanto o número de leituras for menor
    //que 24.
    public static void main(String[] args) {
        Random rc = new Random();
        int c = rc.nextInt(40);
        int h = 0;// horas
        int soma = 0;// soma das temoperaturas

        while (h < 24) {
            h++;// soma horas a 1
            c++;// soma temperatura a 1
            System.out.println(h +" horas e "+ c +" graus");
            soma= soma+ c;
        }

        {
            double media = soma / 24.0;
            System.out.println("A média da temperatura é: " + media);

        }
    }
}
