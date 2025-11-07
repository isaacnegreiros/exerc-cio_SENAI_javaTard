package atividade18;

import java.util.Scanner;

public class atv3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto com várias frases:");
        String texto = sc.nextLine();

        String[] frases = texto.split(" ");
        String text = max(texto, frases);
        resultado(text);
    }

    public static String max(String texto, String[] frases) {

        int i = 0;
        int contador = 0;

        while (i < frases.length) {
            for (int pietro = 0; pietro < frases[i].length(); pietro++) {
                contador++;
            }
            i++;
        }

        String resp = "Quantidade de palavras " + contador;
        return resp;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}




