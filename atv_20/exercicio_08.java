package Ativ_20;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vect = new double[7];
        double soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Insira a temperatura " + (i + 1) + ": ");
            vect[i] = sc.nextInt();
        }
        for (double resp : vect) {
            System.out.println(resp + "°C");
            }
        System.out.println("");
        for (int i = 0; i < vect.length; i ++)
            if (vect[i] >= 35) {
                System.out.println("Calor elevado no dia " + (i + 1) + " (" + vect[i] + "°C)");
        }
    }
}