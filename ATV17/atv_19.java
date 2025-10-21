package ATV17;

import java.util.Scanner;

public class atv19 {//é um campo da Inteligência Artificialque permite que computadores "vejam"

    // e interpretem o mundo visual a partir de dados digitais, como imagens e vídeos
    static void main() {
        Scanner sc = new Scanner(System.in);
        int totalpecas = 0;
        int totalfalha = 0;
        int ciclo = 1;
        int falha = 0;
        int pecas = 0;
        double taxafalhas;

        do {
            System.out.println("Ciclo"+ ciclo);
            System.out.println("Informe as falhas");
            falha = sc.nextInt();
            System.out.println("Informe as peças");
            pecas = sc.nextInt();
            System.out.println();
            //validação de entrada
            if (falha < 0 || pecas <= 0) {
                System.out.println("Valores inválidos");
            }
            totalfalha += falha;
            totalpecas += pecas;
            taxafalhas = totalfalha / totalpecas * 100;

            ciclo++;
            System.out.printf("Taxa atual de falhas: %.2f%%/n", taxafalhas);

        } while (taxafalhas > 2.0);
        System.out.printf("Taxa final de falhas: %.2f%%%n/", taxafalhas);
        sc.close();
    }
}

