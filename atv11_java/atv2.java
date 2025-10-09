package atv11java;

import java.util.Random;

public class atv2 {
    public static void main(String[] args) {
        Random r = new Random();
        int c = r.nextInt(100);
        if (c < 10) {
            System.out.println("o produto esta com " + c + "% de qualidade:reprovado");
        } else {
            if (c > 10 && c < 60) {
                System.out.println("o produto esta com " + c + "% de qualidade:analise manual");
            }
            else {
                if (c>60 && c<80){
                    System.out.println("o produto esta com " + c + "% de qualidade: retrabalho");
                } else {
                    if (c>85 && c<100){
                        System.out.println("o produto esta com " + c + "% de qualidade:aprovado");
                    }
                }
            }
        }
    }
}




