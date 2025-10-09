package atv11;

import java.util.Scanner;

public class atv29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int defeitos;
        System.out.println("Qual o numero de defeitos");
        defeitos = sc.nextInt();
        if (defeitos>20){
            System.out.println("reprovar");
        }else{
            if (defeitos>=10 && defeitos<=20){
                System.out.println("Retrabalho");
            }
            if (defeitos<10){
                System.out.println("aprovar");
            }
        }
    }
}
