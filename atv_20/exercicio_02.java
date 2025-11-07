package Ativ_20;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira palavras: ");
        String words = sc.nextLine();
        String[] spread = words.split(" ");
        int count = 0;

        int totalCaracteres = words.length();
        System.out.println("Palavras com 4 letras: ");

        for (int i = 0; i < spread.length; i++) {
            if (spread[i].trim().length() == 4) {
                count++;
                System.out.println(count + "° " + spread[i].trim());
            }
        }
    }
}
