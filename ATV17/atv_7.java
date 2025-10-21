package ATV_17_ListaWhile;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Receber o consumo (kWh) por turno de uma linha.
        double total = 0;
        int quantidade = 0;
        double valor;
        do {
            System.out.println("Digite o consumo ou  zero(0) para encerrar");
            valor = sc.nextDouble();
            if (valor!=0) {
                total += valor;
                quantidade++;
            }

        }while(valor!=0);
        if (quantidade>0){
            double media = total/quantidade;
            System.out.printf("total: %.2f | média: %.2f%n", total, media);
        }else{
            System.out.println("consumo não registrado");
        }


    }
}
