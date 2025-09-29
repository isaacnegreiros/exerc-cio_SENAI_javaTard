package exercicios;

import java.util.Scanner;

public class exercício_2 {
    static void main() {
        int raio, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        raio = sc.nextInt();
        x = raio * raio;
        System.out.println("O valor do raio é: " + x);

    }
}
