package ATV13_Atv11;

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a % da bateria dos drones? ");
        double bateria = sc.nextDouble();
        if (bateria < 20) {
            System.out.println("Retorno imediato");
        } else {
            if (bateria > 20 && bateria <= 60) {
                System.out.println("Rota curta");
            } else {
                System.out.println("Rota longa");
            }
        }
        sc.close();


    }
}
