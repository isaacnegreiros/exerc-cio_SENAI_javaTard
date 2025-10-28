package Atv_17;

import java.util.Scanner;

public class atv_20 {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o horário do seu turno?");
        t = sc.nextInt();
        String a = max(t);
        resultado (a);}
        public static String max(int t){
        String resp;

        if (t<12) {
            resp = "Manhã";
        }else if (t >12 && t <18) {
            resp = "Tarde";
        }else {
            resp = "Noite";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }

}


