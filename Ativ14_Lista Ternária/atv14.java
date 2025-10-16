package Ativ14;

import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a nota do aluno? ");
        double nota = sc.nextDouble();
        System.out.println();
        System.out.println(nota>=7 ? "Aprovado":"Reprovado");
    }
}
