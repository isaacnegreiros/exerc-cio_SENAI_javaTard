package Atv_17;

import java.util.Scanner;

public class atv_11 {
    public static void main(String[] args) {
        double batery;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a bateria restante do drone: ");
        batery = sc.nextDouble();
        String drone=max(batery);
        resultado(drone);}
        public static String max(double batery){
        String resp;
        if (batery<20) {
           resp="Retorno imediato.";
        }

        else if (batery>=20 && batery<=60) {
            resp = "Rota curta.";
        }

        else {
            resp = "Rota longa.";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}


