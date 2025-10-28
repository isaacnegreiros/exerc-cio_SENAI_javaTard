package atividade17;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        int em;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a porcentagem do material restante: ");
        em = sc.nextInt();
        String datashow = max(em);
        resultado(datashow);
    } public static String max(int em){
        String resposta;

        if (em <20) {
         resposta="Trocar.";
        }else{
           resposta="Continuar.";
        }return resposta;
    } public static void resultado(String respota){
        System.out.println(respota);
    }
}
