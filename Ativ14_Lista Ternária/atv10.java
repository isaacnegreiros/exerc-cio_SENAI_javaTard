package Ativ14;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println("digite o numero:");
        n= sc.nextDouble();
        String impar = (n % 2 != 0) ? "impar" : "par";
        System.out.println(impar);
    }
}
