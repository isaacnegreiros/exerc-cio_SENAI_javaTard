package ATV17_DoWhile;

import java.util.Scanner;

public class atv_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D01=0,D02=0,D03=0;
        String fim;
        System.out.print("Insira sequencialmente as ocorrências dos defeitos D01, D02,D03 e FIM para encerrar: ");
        System.out.println();
        do {
            fim = sc.nextLine().trim().toUpperCase();
            if (fim.equals("D01")) {
                D01++;
            }
            else {
                if (fim.equals("D02")) {
                    D02++;
                } else if (fim.equals("D03")) {
                    D03++;

                }
            }
        } while(!fim.equals("FIM"));
        System.out.print("D01: "+D01+" | D02: "+D02+" | D03: "+D03);
        sc.close();
    }
}
