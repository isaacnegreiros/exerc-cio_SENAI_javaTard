package Ativ_20;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome: ");
        String ent = sc.nextLine();
        String[] nomes = ent.split(",");

        for (int i = 0; i < nomes.length; i++){
            System.out.println((i + 1) +"° "+ nomes[i].trim());
        }
    }
}