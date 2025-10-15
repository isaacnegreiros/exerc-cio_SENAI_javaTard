package atividade15;

public class exerc_6 {
    public static void main(String[] args) {
        int peca = 0;
        double time = 60;
        while (peca <= 10) {
            System.out.printf("peça: %.2f time.%n", time);
            System.out.println("peças pruduzidas:" + peca);
            time = time - 6;
            peca = peca + 1;
        }
    }
}