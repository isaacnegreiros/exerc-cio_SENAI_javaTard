package atividade_Condicionalternária;

import java.util.Scanner;

public class exercios_2 {
    public static void main(String[] args) {
        double inteiro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o numero?");
        inteiro = sc.nextDouble();
        System.out.println();
        System.out.println(inteiro<0 ? "Negativo":"Positivo");


    }
}
