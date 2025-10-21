package ATV17_DoWhile;

import java.util.Scanner;

public class atv_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mA,MD=0;

        do {
            System.out.println("Insira o valor de mA: ");
            mA = sc.nextDouble();

            MD=mA;
            if (MD<4 || MD>20){
                System.out.println("digite a calibraçao novamente");
            }
        }while(MD<4 || MD>20);
        System.out.println("Calibração OK: "+MD);

    }
}
