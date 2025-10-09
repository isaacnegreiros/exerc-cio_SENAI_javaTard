package atv11;

import java.util.Scanner;

public class atv26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinta;
        System.out.println("Qual a porcentagem da tinta?");
        tinta = sc.nextInt();
        if (tinta < 15) {
            System.out.println("Parar");
        }else{
            if (tinta>15 && tinta<=50){
                System.out.println("alerta");
            }
            if (tinta > 50){
                System.out.println("Continuar");
            }
        }

    }
}