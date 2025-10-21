package ATV17_DoWhile;

import java.util.Scanner;

public class atv_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//A impressão 3D é um processo de prototipagem rápido, um processo de manufatura personalizável em massa e uma tecnologia que permite a criação de geometrias complexas, não possíveis anteriormente por meio de outros processos de manufatura.
        int x=0,peso,y=0;
        do {
            System.out.println("digite o valor do peso do lote:");
            peso= sc.nextInt();
            x++;
            y+=peso;//y=y+peso
            if (y<500){
                System.out.println("digite mais numeros:");

            }



        }while (y<500);{
            System.out.println("peças:"+x+" peso:"+y);
        }
    }
}
