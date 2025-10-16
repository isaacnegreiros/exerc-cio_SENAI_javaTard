package Ativ14;

import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = sc.nextInt();
        System.out.println("Insira um segundo número: ");
        int num2 = sc.nextInt();
        String r = (num1==num2) ? "São iguais":(num1>num2) ? (num1+" é maior que "+num2):(num2+" é maior que "+num1);
        System.out.println(r);

    }
}
