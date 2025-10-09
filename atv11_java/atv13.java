package ATV13_Atv11;

import java.util.Random;
import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num1 = random.nextInt(130);
        if (num1 < 50) {
            System.out.println("O número de peças produzidas foram de: " + num1 + " aviso de baixo desempenho");
        } else {
            if (num1 >= 50 && num1 < 100) {
                System.out.println("O número de peças produzidas foram de: " + num1 + " aviso de desempenho regular");
            } else {
                System.out.println("O número de peças produzidas foram de: " + num1 + " aviso de desempenho ótimo");
            }
        }
        sc.close();

    }
}
