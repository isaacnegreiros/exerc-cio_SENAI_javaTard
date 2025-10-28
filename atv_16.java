package Atv_17;

import java.util.Scanner;

public class atv_16 {
    public static void main(String[] args) {
        String d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Como tá o defeito da peça? (Visível, Microscópico, Ausente.)");
        d = sc.nextLine();
        String a = max(d);
        resultado(a);}
        public static String max(String d){
        String resp;

        if (d.equalsIgnoreCase("Visível")) {
            resp = "O nível do defeito da peça é alto";
        }
        else if (d.equalsIgnoreCase("Microscópico")) {
            resp = "O nível do defeito da peça é médio";
        }
        else {
            resp = "O nível do defeito da peça é baixo";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}


