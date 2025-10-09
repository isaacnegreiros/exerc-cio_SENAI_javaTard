package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double st;
        System.out.printf("qual o numero de estoque?");
        st = sc.nextDouble();
        if (st >= 20) {
            System.out.println("estoque suficiente");

        } else {
            System.out.println("reabastecer estoque");
        }
    }
}