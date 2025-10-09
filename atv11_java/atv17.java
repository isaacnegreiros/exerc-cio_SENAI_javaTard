package atv11java;

import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Robô A está funcionando?");
        String A = sc.nextLine();
        System.out.println("Robô B está funcionando?");
        String B = sc.nextLine();
        if (A.equals("sim")) {
            System.out.println("continuar normalmente");
        } else {
            if (A.equals("não") && B.equals("sim")) {

                System.out.println("Acionar robô B");
            } else {
                if (B.equals("não") && A.equals("não")) {
                    System.out.println("Parar a linha");
                }

            }
        }

        sc.close();
    }
}
