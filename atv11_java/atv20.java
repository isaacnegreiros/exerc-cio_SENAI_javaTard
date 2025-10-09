package atv11java;

import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Horário atual(com vírgula ao invés de dois pontos):  ");
        double hr = sc.nextDouble();
        if (hr<=12.59) {
            System.out.println("Está de manhã.");
        }
        else {
            if (hr>12 && hr<=18) {
                System.out.println("Está de tarde.");
            } else if (hr>18) {
                System.out.println("Está de noite.");

            }
        }
        sc.close();
    }
}
