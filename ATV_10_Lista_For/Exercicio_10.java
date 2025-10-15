package Atividade10;

import java.util.Random;

public class atv10 {
    public static void main(String[] args) {
        Random random = new Random();
        int embalagens = 10, soma = 0, produção = 0, r = 0;
        for (int x = 1; x <= embalagens; x++) {
            r = random.nextInt(10);
            System.out.println("Resultado dos testes de qualidade é de " + r + " Tq");
            soma += r;
            produção = soma;
        }
        System.out.println("Total aprovado é de " + produção + " Tq");
    }
}
