package atividade_Condicionalternária;

import java.util.Scanner;

public class exercício_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero");
        numero = sc.nextInt();

        String resp= (numero%2==0) ? numero+" é par" : numero+" é impar";
        System.out.println(resp);
    }
}
