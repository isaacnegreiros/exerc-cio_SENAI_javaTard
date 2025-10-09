package atv11pipi;

import java.util.Random;

public class atv6 {
    public static void main(String[] args) {
        Random r= new Random();//O veículo deve frear se sensor detectar obstáculo < 5m, reduzir
        //velocidade entre 5 e 15m e acelerar acima de 15m.
        int c= r.nextInt(20);
        if (c<5){
            System.out.println("detectar obstaculos");
        } else {
            if (c>5 && c<15){
                System.out.println("reduzir velocidade");
            }else {
                if (c>15){
                    System.out.println("acelerar");
                }
            }
        }

    }
}
