package Ativ_20;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pontuações são?");
        int points = sc.nextInt();
        int[] vect = new int[points];
        int soma = 0, cont = 0;

        for (int i = 0; i < points; i++) {
            System.out.print("Insira as pontuaçoes: " + (i + 1) + ": ");
            vect[i] = sc.nextInt();
        }
        for (double resp : vect) {
            System.out.println(resp + "Pontos");
        }
        System.out.println("");
        for (int i = 0; i < vect.length; i ++)
            if (vect[i] >= 100) {
                soma += 1;
            }else if (vect[i] < 50){
                cont +=1;
            }
        System.out.println("Destaque: "+soma);
        System.out.println("Precisa treinar: "+cont);
    }
}
