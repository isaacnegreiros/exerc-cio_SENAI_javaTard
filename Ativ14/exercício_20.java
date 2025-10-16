package atividade_Condicionalternária;

import java.util.Scanner;

public class exercício_20 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero");
        numero = sc.nextInt();


        String resp=((numero%2==0)? numero+" é Par":numero+" é Impar");
        System.out.println(resp);

    }
}
