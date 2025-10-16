package Ativ14;

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2;
        System.out.println("digite o primeiro numero");
        n1= sc.nextDouble();
        System.out.println("digite o segundo numero");
        n2= sc.nextDouble();
        String maior =(n1>n2) ?"o primeiro numero é maior": " o segundo numero é maior";
        System.out.println(maior);
    }
}
