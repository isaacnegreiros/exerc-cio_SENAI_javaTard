package atividade_Condicionalternária;

import java.util.Scanner;

public class exercício_3 {
    public static void main(String[] args) {
        double idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a idade da pessoa");
        idade = sc.nextDouble();
        System.out.println();
        System.out.println(idade<16 ? "não pode votar":"pode votar");

    }
}
