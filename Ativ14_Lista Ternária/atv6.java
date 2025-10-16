package atividade_Condicionalternária;

import java.util.Scanner;

public class exercício_6 {
    public static void main(String[] args) {
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto o aluno tirou na prova?");
        nota = sc.nextDouble();
        System.out.println();
        String resp =(nota>=7)? nota+"Aprovado": nota+"Reprovado";
        System.out.println(resp);

    }
}
