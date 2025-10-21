package ATV_17_ListaWhile;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);/*   FORNO INDUSTRIAL:equipamento de aquecimento de alta potência
         usado em diversas indústrias, como a de alimentos, metalurgia e química,
          para processar materiais em altas temperaturas
        */
        int temperatura;
        do {
            System.out.println("digite a temperatura do forno industrial (°C):");
            temperatura= sc.nextInt();
            if (temperatura <800  || temperatura >1200){
                System.out.println("temperatura invalida!! tente novamente:");

            }
        }while (temperatura < 800 || temperatura > 1200);
        System.out.println("temperatura valida chefe!!");


    }
}
