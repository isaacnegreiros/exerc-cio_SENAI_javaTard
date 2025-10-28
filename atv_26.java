package atividade17;

import java.util.Scanner;

public class atv_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinta;
        System.out.println("Qual a porcentagem da tinta? ");
        tinta = sc.nextInt();
        String resultado = pintar(tinta);
        result(resultado);
    }
    public static String pintar(int tinta) {
        String resposta = " ";
        if (tinta <= 15) {
            resposta = "Parar";
        }else{
            if (tinta > 15 && tinta<=50){
                resposta = "Alerta";
            }
            if (tinta > 50){
                resposta = "Continuar";
            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
