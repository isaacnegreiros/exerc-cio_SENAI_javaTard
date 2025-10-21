package ATV17;

import java.util.Scanner;

public class atv8 {//Veículo Guiado Automaticamente.
    static void main() {
        Scanner sc = new Scanner(System.in);
        int viagens = 0;
        int totalcaixas = 0;
        int meta = 50;
        int caixas;


        do{
            System.out.print("Digite a quantidade de caixas entregues na viagem " + (viagens + 1) + ": ");
            caixas = sc.nextInt();
            if (caixas <= 0){
                System.out.println("Por favor, insira um número positivo de caixas");
            }

            totalcaixas += caixas;
            viagens++;
        }while(totalcaixas<meta);
        System.out.println("total de viagens necessárias: "+ viagens);
        sc.close();
    }
}
