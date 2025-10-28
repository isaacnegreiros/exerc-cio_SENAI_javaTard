package atividade17;

import java.util.Scanner;

public class atv_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O tipo de erro é crítico, moderado ou sem erro?");
        String erro = sc.nextLine();
        String resultado = producao(erro);
        result(resultado);
    }
    public static String producao(String erro) {
        String resposta = " ";
        if (erro.equals("crítico")) {
            resposta = "Parar a linha";
        } else {
            if (erro.equals("moderado")) {
                resposta = "Acionar manutenção";
            } else if (erro.equals("sem erro")) {
                resposta = "Continuar Produção";

            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
