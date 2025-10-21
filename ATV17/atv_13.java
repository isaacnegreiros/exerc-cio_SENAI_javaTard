package ATV17_DoWhile;

import java.util.Scanner;

public class atv_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 10,acumulo=0;
        char resp;
        System.out.print("A máquina vai iniciar a mistura.");
        System.out.println();
        do {
            acumulo+=min;
            System.out.println(acumulo+" minutos, deseja continuar(s/n)? ");
            resp = sc.next().charAt(0);
        } while(resp!='n');
        System.out.println("Mistura encerrada aos "+acumulo+" minutos");
    }
}