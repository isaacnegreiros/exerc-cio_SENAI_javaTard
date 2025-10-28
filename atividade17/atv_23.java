package atividade17;

import java.util.Scanner;

public class atv_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trafego;
        System.out.println("Qual a porcentagem do tráfego? ");
        trafego = sc.nextInt();
        String resultado = sinal(trafego);
        result(resultado);
    }

    public static String sinal(int trafego) {
        String resposta= " ";
        if (trafego <= 30 ) {
            resposta = "Normal";
        } else {
            if (trafego > 30 && trafego < 70) {
                resposta = "Bloquear acesso";
            }
            else {
                if (trafego >= 70) {
                    resposta = "Tráfego suspeito";
                }
            }

        }
        return resposta;
    }

    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
