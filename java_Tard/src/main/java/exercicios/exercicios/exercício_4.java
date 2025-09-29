package exercicios.exercicios;

import java.util.Scanner;

public class exercício_4 {
    static void main() {
        int n, nht, vph, x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Qual o numero do funcionário?");
        n= sc.nextInt();
        System.out.println("Quantas horas trabalhadas?");
        nht= sc.nextInt();
        System.out.println("Valor que recebe por hora?");
        vph= sc.nextInt();
        x=nht*vph;
        System.out.println("O numero do funcionário é:" + n);
        System.out.println("O salario do funcionário é: " + x);
    }
}
