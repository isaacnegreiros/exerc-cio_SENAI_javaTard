package Atividade10;

import java.util.Random;

public class atv9 {
    public static void main(String[] args) {
        Random random = new Random();
        int produto = 10, r = 0, soma = 0, mes = 0;
        for (int x = 1; x <= produto; x++) {
            r = random.nextInt(10);
            System.out.println("A média de produtos é de " +r+ "PM");
            soma+=r;
            mes = soma*30;
        }System.out.println("A previsão média em 1 mês é de "+mes+" Unidades");
    }
}