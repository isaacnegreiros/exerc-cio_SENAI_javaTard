package ATV13_Atv08;

import javax.swing.*;
import java.util.Scanner;

public class Exercício_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade do veículo?");
        double vel = sc.nextDouble();
        if (vel >= 120) {
            System.out.println("Você deve reduzir a velocidade quando estiver em: " + vel + " de velocidade");
        }
            else{
                System.out.println("Você está na velocidade adequada");

            }


    }
}
