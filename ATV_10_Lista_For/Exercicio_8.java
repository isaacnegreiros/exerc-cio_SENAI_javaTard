package Atividade10;

import java.util.Random;

public class atv8 {
    public static void main(String[] args) {
        Random random = new Random();
        int maq = 10, r = 0, soma = 0, horas = 0;
        for (int x = 1; x <= maq; x++) {
            r = random.nextInt(10);
            System.out.println("A maquina numero" +x+ " tempo de operação" +r+ " HPO");
            soma+=r;
            horas=soma*365;
        }
        System.out.println("O total de horas de operação em 1 ano é de " +horas+ " HPO");
    }
}