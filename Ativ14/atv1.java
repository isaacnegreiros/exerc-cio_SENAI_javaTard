package atividade_Condicionalternária;

import java.util.Scanner;

public class exercício_1 {
    public static void main(String[] args) {
        double idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        idade = sc.nextDouble();
        System.out.println();
        System.out.println(idade>=18 ? "Maior de idade":"Menor de idade");






    }
}
