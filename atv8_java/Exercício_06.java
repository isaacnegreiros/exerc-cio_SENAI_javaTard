package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi a produção do turno?");
        double prod = sc.nextDouble();
        if (prod >= 1000) {
            System.out.println("Meta atingida");
        } else {
            System.out.println("Produção abaixo da meta");
        }
    }
}
