package atv11;

import java.util.Scanner;

public class atv30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Qual a temperatura?");
        temp = sc.nextInt();
        if (temp>80){
            System.out.println("desligar servidores");
        }else{
            if (temp>=60 && temp<=80){
                System.out.println("resfriamento extra");
            }
            if (temp<60){
                System.out.println("normal");
            }
        }
    }
}
