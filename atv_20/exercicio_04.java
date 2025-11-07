package Ativ_20;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas deseja digitar?");
        int n= sc.nextInt();
        double[] notas= new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i]= sc.nextDouble();
        }

        for (double indice : notas) {
            if (indice>=60) {
                System.out.println(indice+" Aprovado");
            } else
                System.out.println(indice+" Reforço");
        }
    }
}
