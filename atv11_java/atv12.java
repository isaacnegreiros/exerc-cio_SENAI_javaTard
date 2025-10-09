package ATV13_Atv11;

import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crachá válido? ");
        String r = sc.nextLine();
        System.out.println("Faz uso do capacete de segurança? ");
        String r2 = sc.nextLine();
        System.out.println("Qual o turno? ");
        String r3 = sc.nextLine();
        if (r.equals("sim") && r2.equals("sim") && r3.equals("noturno")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
