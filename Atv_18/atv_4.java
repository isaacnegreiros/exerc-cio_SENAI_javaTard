package Atividade18;

import java.util.Scanner;

import static Atividade18.atv_1.Calculadora;
import static Atividade18.atv_1.resultado;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,arm;
        System.out.println("Digite o numero q deseja");
        n1 = sc.nextInt();
        int fator=Calculadora(n1);
        resultado(String.valueOf(fator));}
        public static int Calculadora(int n1){
        int i=1;
        int fat=1;
        while (i <= n1){
            fat*=i;
            i++;
        }
        return fat;



        }public static void resultado(String resp){
        System.out.println(resp);
    }
}
