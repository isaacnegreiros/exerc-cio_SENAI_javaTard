package atividade17;

import java.util.Scanner;

public class atv_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eletricidade;
        System.out.println("Qual a intensidade eletrica? ");
        eletricidade = sc.nextInt();
        String resultado = energia(eletricidade);
        result(resultado);
    }
    public static String energia(int eletricidade) {
        String resposta = " ";
        if (eletricidade<100){
            resposta = "Fraca";
        }else{
            if (eletricidade>=100 && eletricidade<=200){
                resposta = "Média";
            }
            if (eletricidade > 200){
               resposta = "Forte";
            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
