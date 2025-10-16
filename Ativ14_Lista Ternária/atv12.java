package Ativ14;

import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("digite a sua idade:");
        i= sc.nextInt();
        String a= (i>=18)? "maior de idade":"menor de idade";
        System.out.println(a);
    }
}
