package Ativ14;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double idade;
        System.out.println("digite sua idade:");
        idade= sc.nextDouble();
        String categoria = (idade < 12) ? "Infantil" : (idade < 18) ? "Juvenil" : "Adulto";
        System.out.println("Categoria: " + categoria);




    }
}
