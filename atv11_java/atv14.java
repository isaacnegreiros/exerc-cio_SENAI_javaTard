package ATV13_Atv11;

import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade a esteira? ");
        double vel= sc.nextDouble();
        if (vel>=0 && vel<15) {
            System.out.println("Velocidade lenta.");
        }
        else {
            if (vel>=15 && vel<=20) {
                System.out.println("Velocidade média.");
            }
            else {
                System.out.println("Velocidade rápida.");
            }
        }
        sc.close();

    }
}
