package atividade17;

import java.util.Scanner;

public class atv_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto;
        System.out.println("Há quantos produtos? ");
        produto = sc.nextInt();
        String resultado = produtos(produto);
        result(resultado);
    }
    public static String produtos(int produto) {
        String resposta=" ";
        if (produto<= 10){
            resposta = "reabastecer urgente";
        }else{
            if (produto > 10 && produto<=30){
                resposta = "alerta";
            }
            if (produto > 30){
                resposta = "normal";
            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
