package ATV_17_ListaWhile;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// O programa soma até atingir
       // ou superar a meta diária (120 peças).
        int ciclos=0 ,arm=0,p;
        do {
            System.out.println("digite quantas peças foram produzidas:");
            p= sc.nextInt();
            arm=arm+p;
            ciclos++;

            if (arm<120){
                System.out.println("meta diaria nao atingida!!");
            }


        } while (arm<120);
        System.out.print("ciclos:"+ciclos+" peças:"+arm);
    }
}
