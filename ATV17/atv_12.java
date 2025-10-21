package ATV17;

import java.util.Scanner;

public class atv12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int np;
        int contagem = 0;

        System.out.println("Digite um numero ou digite -1 para encerrar o processo");

        do {
            while (contagem != -1) {
                System.out.println("Digite novamente");
                sc.next();//descarta entrada válida
            }
            np = sc.nextInt();
            if (contagem == -1) {
                contagem++;
            }
        } while (contagem != -1);
        System.out.println("Numero de paletes registrados: " + contagem);
    }   }