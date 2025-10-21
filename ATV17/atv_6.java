package ATV17_DoWhile;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        int ap = 0, rep = 0;
        String entrada;
        Scanner sc = new Scanner(System.in);//O que é inspeção visual? A inspeção visual é uma técnica para detectar defeitos a olho nu para garantir que o equipamento esteja funcionando corretamente ou que os produtos fabricados estejam sendo feitos de acordo com as especificações.
        do {
            System.out.println("Digite resultados (A = aprovada, R = reprovada). Para finalizar, digite FIM.");
            entrada = sc.next().toUpperCase();
            if (entrada.equals("A")) {
                ap++;

            } else {
                if (entrada.equals("R")) {
                    rep++;
                }
            }
        } while (!entrada.equals("FIM"));
        System.out.println("aprovados:" + ap + " reprovados:" + rep);
    }
}
