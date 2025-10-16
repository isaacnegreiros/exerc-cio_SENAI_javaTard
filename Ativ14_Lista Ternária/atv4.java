package atividade_Condicionalternária;

import java.util.Scanner;

public class exercício_4 {
    public static void main(String[] args) {
        double temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos graus está fazendo?");
        temperatura = sc.nextDouble();
        System.out.println();
        System.out.println(temperatura<18 ? "frio":"quente");
    }
}
