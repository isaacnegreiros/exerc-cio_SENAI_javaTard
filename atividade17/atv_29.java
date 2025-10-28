package atividade17;

import java.util.Scanner;

public class atv_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int defeitos;
        System.out.println("Qual o numero de defeitos");
        defeitos = sc.nextInt();
        String resultado = producao(defeitos);
        result(resultado);
    }
    public static String producao(int defeitos) {
        String resposta = " ";
        if (defeitos>20){
            resposta = "Reprovar";
        }else{
            if (defeitos>=10 && defeitos<=20){
                resposta = "Retrabalho";
            }
            if (defeitos<10){
                resposta = "Aprovar";
            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
