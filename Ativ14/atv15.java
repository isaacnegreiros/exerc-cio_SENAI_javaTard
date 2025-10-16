package Ativ14;

import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua idade: ");
        double idade = sc.nextDouble();
        System.out.println();
        String resposta = (idade>=16) ? "Pode votar":"Não pode votar";
        System.out.println(resposta);
    }
}
