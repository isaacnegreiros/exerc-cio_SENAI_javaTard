package atividade17;

import java.util.Scanner;

public class atv_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Qual a temperatura?");
        temp = sc.nextInt();
        String resultado = temperatura(temp);
        result(resultado);
    }
    public static String temperatura(int temp) {
        String resposta = " ";
        if (temp>80){
            resposta = "Desligar servidores";
        }else{
            if (temp>=60 && temp<=80){
                resposta = "Resfriamento extra";
            }
            if (temp<60){
                resposta = "Normal";
            }
        }
        return resposta;
    }
    public static void result(String retorno) {
        System.out.println(retorno);
    }
}
