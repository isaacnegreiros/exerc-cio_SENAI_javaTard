package Atv_18;

import java.util.Locale;
import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite respectivamente a moeda a ser convertida, o valor a ser convertido e a moeda para qual será convertido o valor(Real,Dólar ou Euro) ");
      String dados = sc.nextLine();
      String[] dividir = dados.split(" ");
      String moeda = dividir[0].toLowerCase();
      double valor = Double.parseDouble(dividir[1]);
      String moeda_2 = dividir[2].toLowerCase();
        double resultado = impressao(valor, moeda, moeda_2);
        result(resultado);
    }

    public static double impressao(double valor, String moeda, String moeda_2) {
        double realDolar = 5.38, realEuro = 6.23, dolarEuro = 0.86;
        double conta;

        if (moeda.equals("real") && moeda_2.equals("dolar")) {
            conta = valor / realDolar;
        } else if (moeda.equals("dolar") && moeda_2.equals("real")) {
            conta = valor * realDolar;
        } else if (moeda.equals("real") && moeda_2.equals("euro")) {
            conta = valor / realEuro;
        } else if (moeda.equals("euro") && moeda_2.equals("real")) {
            conta = valor * realEuro;
        } else if (moeda.equals("dolar") && moeda_2.equals("euro")) {
            conta = valor / dolarEuro;
        } else if (moeda.equals("euro") && moeda_2.equals("dolar")) {
            conta = valor * dolarEuro;
        } else {
            System.out.println("Erro");
            return 0;
        }
        return conta;


    }

    public static void result(double resposta) {
        System.out.printf("O valor da conversão é: %.2f%n",resposta);
    }
}
