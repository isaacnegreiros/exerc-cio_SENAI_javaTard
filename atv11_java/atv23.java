package atv11;

import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trafego;
        System.out.println("Qual a porcentagem do tráfego");
        trafego = sc.nextInt();
        if (trafego<70){
            System.out.println("tráfego suspeito");
        }else {
            if (trafego > 30 && trafego < 70){
                System.out.println("bloquear acesso");
            }
            if (trafego < 30) {
                System.out.println("normal");
            }
        }
    }
}
