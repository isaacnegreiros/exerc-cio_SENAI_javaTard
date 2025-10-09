package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nível de energia?");
        double energia = sc.nextDouble();
        if (energia >= 50) {
            System.out.println("Robô iniciando pintura");
        } else {
            System.out.println("Energia insuficiente");
        }
    }
}