package ATV_20_ForEach;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();


        String[] palavras = frase.split("\\s+");

        System.out.println("Palavras limpas:");
        for (String palavra : palavras) {
            String dividir= palavra.replaceAll("[.,;!?]"," ");
            System.out.print(dividir);

        }
    }
}