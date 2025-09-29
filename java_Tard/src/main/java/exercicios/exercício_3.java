package exercicios;

import java.util.Scanner;

public class exercício_3 {
    static void main() {
        int a, b, c , d , x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        a= sc.nextInt();
        System.out.println("Digite o segundo numero");
        b= sc.nextInt();
        System.out.println("Digite o terceiro numero");
        c= sc.nextInt();
        System.out.println("Digite o quarto numero");
        d= sc.nextInt();
        x=a*b-c*d;
        System.out.println("O resultado é: " + x);
    }
}
