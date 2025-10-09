package atv11;

import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double carga;
        System.out.println("Qual a carga ");
        carga = sc.nextDouble();
        if (carga < 500) {
            System.out.println("Quantidade permitida");
        } else {
            if (500<=1000) {
                System.out.println("Alerta");
            }
            if (carga>1000) {
                System.out.println("proibido");
            }


        }
    }
}