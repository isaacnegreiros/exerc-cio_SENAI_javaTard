package atv11java;

import java.util.Random;

public class atv3 {
    public static void main(String[] args) {
        Random r= new Random();
        int c= r.nextInt(100);//Energia< 30%, modo
        //normal entre 30% e 70%, e modo turbo acima de 70%.
        if (c<30){
            System.out.println("economia de energia");
        } else {
            if (c>30 && c<70)
                System.out.println("modo normal");
            else {
                if (c>70)
                    System.out.println("modo turbo");
            }
        }

    }
}
