package atv11;

import java.util.Scanner;

public class atv27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O tipo de erro é crítico, moderado ou sem erro?");
        String erro = sc.nextLine();
        if (erro.equals("crítico")) {
            System.out.println("Parar a linha");
        } else {
            if (erro.equals("moderado")) {
                System.out.println("Acionar manutenção");
            } else if (erro.equals("sem erro")) {
                System.out.println("Continuar produção");

            }
        }

    }
}
