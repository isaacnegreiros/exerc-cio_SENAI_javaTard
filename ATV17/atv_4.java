package ATV17_DoWhile;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//O seu Painel na Ummense é a sua principal tela de trabalho. Nessa tela ficam agrupadas as principais atividades do seu dia, e você pode acessar de forma fácil e rápida suas tarefas, eventos dos próximos dias e os cards nos quais você está trabalhando.
        int re;
        do {
            System.out.println("1. Registrar parada");
            System.out.println("2. Registrar produção");
            System.out.println("3. Sair do while");
            System.out.println("digite um numero para o painel funcionar:");
            re = sc.nextInt();
            if (re == 1) {
                System.out.println("parada registrada");

            } else {
                if (re == 2) {
                    System.out.println("registrando produçao");
                } else {
                    if (re == 3) {
                        System.out.println("saindo do while");
                    }
                }
            }
        }while (re>4);
        System.out.println("erro");
    }

}

