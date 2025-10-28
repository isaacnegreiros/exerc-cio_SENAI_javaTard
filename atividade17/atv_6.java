package atividade17;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        int obs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos metros de distancia o obstáculo está: ");
        obs = sc.nextInt();
        String metros=max(obs);
        resultado(metros);
    } public static String max(int obss){
        String resposta;

        if (obss <5){
           resposta="Frear de imediato.";
        }
        else{
            resposta="reduzir velocidade entre 5 e 15m e acelerar acima de 15m.";

        } return resposta;
    }public static void resultado(String resposta){
        System.out.println(resposta);
    }
}
