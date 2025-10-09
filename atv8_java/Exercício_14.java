package Atividade8;

import java.util.Scanner;

public class Exercício_14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double p;
        System.out.println("Qual o numero de peças montadas?");
        p = sc.nextDouble();
        if (p == 0)  {
            System.out.println("Erro verificar robô");
        }
        else {
            System.out.println("Montagem em andamento");
        }



    }
}
