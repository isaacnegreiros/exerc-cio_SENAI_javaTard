package Ativ14;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1;
        System.out.println("digite um numero:");
        n1= sc.nextInt();
        String ver= (n1 == 0) ? "zero" : (n1 < 0) ? "negativo" : "postivo";
        System.out.println(ver);
    }
}
