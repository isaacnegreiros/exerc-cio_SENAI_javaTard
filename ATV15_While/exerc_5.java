package atividade15;

public class exerc_5 {
    public static void main(String[] args) {
        double pressao = 0;
        while (pressao <= 120) {
            System.out.printf("pressao: %.2f PSI.%n", pressao);
            pressao = pressao + 1;

        }
        System.out.println("parar maquina");
    }
}