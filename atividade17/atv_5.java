package Atv_17;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        double hours;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as horas de uso da máquina.");
        hours = sc.nextDouble();
        String hora = max(hours);
        resultado (hora);}
        public static String max(double hours){
        String resp;

        if (hours < 500) {
            resp = "A urgência de manutenção da máquina é baixa.";
        }

        else if (hours >= 500 && hours <= 1000) {
            resp = "A urgência de manutenção da máquina é média.";
        }

        else {
            resp = "A urgência de manutenção da máquina é alta.";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}


