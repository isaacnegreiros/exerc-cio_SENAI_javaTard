package Ativ_20;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de preços: ");
        int n = sc.nextInt();

        double[] precos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o preço " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }
        double soma = 0.0;
        System.out.println("Preços informados: ");
        for (double valor : precos) {
            System.out.println(valor);
            soma += valor;
        }

        double media = soma / n;
        System.out.println("A média é: "+media);
    }
}
