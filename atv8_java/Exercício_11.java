package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_11 {
    public static void main(String[] args) {
        String op="sim";
        Scanner sc = new Scanner(System.in);
        System.out.println("O sensor detectou algo? ");
        op = sc.next();
        if (op.equals("sim")){
            System.out.printf("Parar a linha de produção");
        }
        else {
            if (op.equals("não")) {
                System.out.printf("Linha de produção operando normalmente");
            }

        }

    }
}
