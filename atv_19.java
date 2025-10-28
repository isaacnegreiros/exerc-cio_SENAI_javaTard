package Atv_17;

import java.util.Scanner;

public class atv_19 {
    public static void main(String[] args) {
        int pH;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o pH: ");
        pH = sc.nextInt();
        String jordan = max(pH);
        resultado(jordan);}
        public static String max(int pH){
        String resp;

        if (pH<7) {
            resp = "PH ácido.";
        }

        else if (pH == 7) {
            resp = "PH neutro.";
        }

        else {
            resp = "PH básico.";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}



