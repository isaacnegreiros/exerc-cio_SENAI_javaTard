package atividade17;

import java.util.Scanner;

public class atv_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a carga ");
        int carga = sc.nextInt();

        String maximo=max(carga);
        showResult(maximo);
        sc.close();

    }
    public static String max(int carga) {
        String resultado;
        if (carga<500) {
            resultado = "Quantidade permitida";
        } else if (carga<=1000) {
            resultado = "Alerta";
        } else {
            resultado = "Proibido";
        }
        return resultado;
    }
    public static void showResult(String retorno) {
        System.out.println(retorno);
    }
}

