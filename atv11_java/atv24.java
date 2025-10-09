package atv11;

import java.util.Scanner;

public class atv24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto;
        System.out.println("Há quantos produtos?");
        produto = sc.nextInt();
        if (produto<10){
            System.out.println("reabastecer urgente");
        }else{
            if (produto >10 && produto<=30){
                System.out.println("alerta");
            }
            if (produto > 30){
                System.out.println("normal");
            }
        }
    }
}
