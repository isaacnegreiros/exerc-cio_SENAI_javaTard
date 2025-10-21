package ATV17;

import java.util.Scanner;

public class atv11 {//conjunto de materiais brutos.
    static void main() {
        Scanner sc = new Scanner(System.in);
        double umidade = 0;
        int valor;

        do {
            System.out.println("Digite o valor da umidade");
            umidade = sc.nextDouble();
            if (umidade < 30 || umidade > 55) {
                System.out.println("Umidade fora do intervalo aceitável");


            }


        }while (umidade > 30 | umidade < 55) ;
        System.out.println("faça uma nova leitura");

    }
}