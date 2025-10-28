package atividade17;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        double weight;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o peso do pacote: ");
        weight = sc.nextDouble();
        String peso= max(weight);
        resultado(peso);
    }

    public static String max(double weight) {

        String resposta;

        if (weight < 10) {
            resposta = "Peso leve.";
        } else if (weight >= 10 && weight <= 30) {
            resposta = "Peso médio.";
        } else {
            resposta = "Peso pesado.";
        }
        return resposta;
    }

    public static void resultado (String resposta) {
        System.out.println(resposta);

    }
}
