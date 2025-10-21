package ATV17;

import java.util.Scanner;

//Takt Time: Ritmo de produção necessário para atender uma demanda.
public class atv_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int takt, tempo, media, estacoes=0,qtd=0,soma=0;
        System.out.println("Qual o takt time? ");
        takt = sc.nextInt();
        do {
            System.out.println("Digite o tempo "+(qtd+=1)+":");
            tempo = sc.nextInt();
            if (tempo>=0) {
                estacoes++;
            }
            soma+=tempo;
            media = soma/estacoes;
        }while(media<=takt);
        System.out.println("Média: "+media);
        System.out.println("Estações: "+estacoes);
    sc.close();}
}
