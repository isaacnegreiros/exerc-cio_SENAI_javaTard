package atividade18;

import java.util.Scanner;

public class atividade_6 {
    static void main() {
        System.out.println("=== Calculadora de Média de Notas ===");

        int quantidadeNotas = QuantidadeNotas();
        double[] notas = Notas(quantidadeNotas);
        double media = calcularMedia(notas);
        exibirResultado(media);
    }


    public static int QuantidadeNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de notas: ");
        int quantidade = scanner.nextInt();
        return quantidade;
    }

    public static double[] Notas(int quantidade) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();


            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                i--; // repete a iteração
                continue;
            }

            notas[i] = nota;
        }

        return notas;
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static void exibirResultado(double media) {
        System.out.printf("Média do aluno: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado ");
        } else if (media >= 5.0) {
            System.out.println("Situação: Recuperação ️");
        } else {
            System.out.println("Situação: Reprovado ");
        }
    }
}


