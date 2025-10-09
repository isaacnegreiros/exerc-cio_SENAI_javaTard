package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p;
        System.out.println("qual o peso da peça?");
        p = sc.nextDouble();
        if (p>=5) {
            System.out.println("peça pesada");}
        else {
            System.out.println("peça leve");}
    }
}
