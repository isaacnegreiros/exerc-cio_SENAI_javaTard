package atividade17;

import java.util.Scanner;

public class atv_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crachá válido? ");
        String r = sc.nextLine();
        System.out.println("Faz uso da capacete de segurança? ");
        String r2 = sc.nextLine();
        System.out.println("Qual o turno? ");
        String r3 = sc.nextLine();
        String mcqueen = max(r,r2,r3);
        result(mcqueen);
    }
    public static String max(String r,String r2, String r3){
        String resultado= " ";
        if (r.equals("sim") && r2.equals("sim") && r3.equals("noturno")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        return resultado;
    }
    public static void result(String labubu) {
        System.out.println(labubu);
    }
}