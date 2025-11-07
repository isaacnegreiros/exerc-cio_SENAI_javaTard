package Atv_18;

import java.util.Locale;
import java.util.Scanner;

public class atv_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double taxa,capital,tempo1,montante=0;
        System.out.println("Qual o valor do capital a ser aplicado? ");
        capital = sc.nextDouble();
        System.out.println("Qual o valor da taxa? ");
        taxa = sc.nextDouble();
        System.out.println("São quantas prestações? ");
        tempo1 = sc.nextDouble();
        double resultado = CalculadoraJurosCompostos(capital,taxa, tempo1,montante);
        result(resultado);
    }
    public static double CalculadoraJurosCompostos(double capital,double taxa,double tempo1,double montante) {
        while(montante==0) {
            double contataxa = (taxa / 100), conta = (1 + contataxa);
            double tempo = Math.pow(conta, tempo1);
            if (capital != 0) {
                montante = capital * tempo;
            }
        }
        return montante;
    }
    public static void result(double coisa) {
        System.out.printf("Valor final= %.2f%n",coisa);
    }
}
