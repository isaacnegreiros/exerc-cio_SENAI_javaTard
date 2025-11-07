package Ativ_20;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira todos os códigos: ");
        String code = sc.nextLine();

        String[] codeVect = code.split(",");

        System.out.println("Insira o código que você deseja saber: ");
        String resp = sc.nextLine();

        int soma = 0;

        for (String ins : codeVect) {
            if (ins.equalsIgnoreCase(resp)){
                soma++;
            }
        }
        System.out.println("Código: "+resp+ " aparece "+soma+ " vezes.");
    }
}