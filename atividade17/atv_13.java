package atividade17;

import java.util.Scanner;

public class atv_13 {
    public static void main(String[] args) {
        double production;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a produção por hora: ");
        production = sc.nextDouble();
        String ben = max(production);
        resultado(ben);
    }

    public static String max(double production) {
        String resposta;
        if (production < 50) {
            resposta = "Baixo desempenho";
        } else if (production >= 50 && production <= 100) {
            resposta = "Regular";
        } else {
            resposta = "Ótimo";
        }
        return resposta;

    }

    public static void resultado(String resposta) {
        System.out.println(resposta);
    }
}

