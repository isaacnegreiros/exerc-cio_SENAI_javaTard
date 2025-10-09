package atv11;

import java.util.Scanner;

public class atv25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eletricidade;
        System.out.println("Qual a intensidade eletrica?");
        eletricidade = sc.nextInt();
        if (eletricidade<100){
            System.out.println("fraca");
        }else{
            if (eletricidade>100 && eletricidade<=200){
                System.out.println("média");
            }
            if (eletricidade > 200){
                System.out.println("forte");
            }
        }
    }
}
