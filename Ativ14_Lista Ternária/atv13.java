package Ativ14;

import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário?");
        double salario = sc.nextDouble();
        System.out.println(salario>3000 ? "Salário alto":"Salário Baixo");
    }
}
