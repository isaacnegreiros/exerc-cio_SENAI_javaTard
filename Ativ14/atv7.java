package Ativ14;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double salario ,v,d,r;
        System.out.println("digite seu salario:");//ler salario do funcionario
        salario= sc.nextDouble();
        v = salario*0.2;
        d= salario*0.1;
        r = (salario >= 5000) ? v : d;
        System.out.printf("o seu imposto conforme o salario é de:"+r);
    }
}
