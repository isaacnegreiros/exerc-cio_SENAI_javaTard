package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x;
        System.out.println("digite o nivel de oleo:");
        x= sc.nextDouble();
        if (x>=30) {
            System.out.println("nivel adequado");}
        else {
            System.out.println("adicionar oleo");
        }
    }
}
