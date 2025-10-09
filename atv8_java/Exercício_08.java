package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nível de óleo?");
        double ole = sc.nextDouble();
        if (ole>=30){
            System.out.println("Está no nível adequado");
        }
        else{
            System.out.println("Deve adicionar mais óleo");

        }
    }
}
