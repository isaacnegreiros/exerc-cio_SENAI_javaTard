package eucasa;

import java.util.Random;

public class atv6 {
    static void main() {
        Random sc = new Random();
        int mat=50, r=0, med=0,armazenar=0;
        for (int x=1; x<=mat;x++){
            r= sc.nextInt(650);
            System.out.println("o material "+x+" tem o consumo de "+r);
            armazenar+=r;

        } med= armazenar/50;
        System.out.println("o consumo mensal é de: "+med);
    }
}
