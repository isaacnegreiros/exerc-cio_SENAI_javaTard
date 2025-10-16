package Ativ14;

import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura atual? ");
        double temp = sc.nextDouble();
        String r = (temp>=30) ? "Está Quente":"Está Frio";
        System.out.println(r);
        sc.close();
    }
}
