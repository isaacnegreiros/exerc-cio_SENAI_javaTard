package Atividade8;

import java.util.Scanner;

public class Exercício_15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double pa;
        System.out.println("Qual a porcentagem de peças aprovadas?");
        pa = sc.nextDouble();
        if (pa>=90) {
            System.out.println("Qualidade aceitável");
        }
        else {
            System.out.println("Qualidade abaixo do padrão");
        }
    }
}
