package atividade17;

import java.util.Locale;
import java.util.Scanner;

public class atv_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo de rota?");
        String rota = sc.nextLine();
        String resultado = gps(rota);
        result(resultado);
    }
    public static String gps(String rota) {
        String resposta = " ";
        if (rota.equals("bloqueada")){
            resposta = "Recalcular rota";
        }else{
            if (rota.equals("transito alto")){
                resposta = "Rota alternativa";
            }
            if (rota.equals("senão")){
                resposta = "Seguir rota normal";
            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
