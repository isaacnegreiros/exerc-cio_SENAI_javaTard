package atv11pipi;

import java.util.Random;

public class atv7 {
    public static void main(String[] args) {
        Random r= new Random();//Um robô classifica pacotes por peso: leves (<10kg), médios (10–30kg),
        //esados (30–60kg), muito pesados (>60kg).
        int c= r.nextInt();
        if (c<10){
            System.out.println(c+"kg peso:leve");}
        else {
            if (c>10 && c<30){
                System.out.println(c+"kg peso:medio");
            }else {
                if (c>30 && c<60){
                    System.out.println(c+"kg peso:pesado");
                }else {
                    if (c>60){
                        System.out.println(c+"kg peso:muito pesado");
                    }
                }
            }
        }
    }
}
