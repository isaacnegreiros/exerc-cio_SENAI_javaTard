package Atv_17;

import java.util.Scanner;

public class atv_18 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nível da energia solar disponível? (0 A 100)");
        n = sc.nextInt();
        String p = max(n);
        resultado (p);}
        public static String max(int n){
        String resp;

        if (n >70) {
            resp = "Usar energia solar.";

        }else if (n >30 && n<70) {
            resp = "usar as duas energia.";

        }else{
            resp = "Usar rede elétrica.";
        }return resp;

    }public static void resultado(String resp){
        System.out.println(resp);
    }
}


