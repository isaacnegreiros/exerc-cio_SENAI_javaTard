package Ativ14;

import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) { //maior que 2000
        Scanner sc = new Scanner(System.in);
        System.out.println("Por quantas horas você trabalhou? ");
        double ht = sc.nextDouble();
        System.out.println("Quanto você ganha por hora? ");
        double hg = sc.nextDouble();
        double conta = ht*hg;
        String r = (conta>2000) ? (conta+" é um salário bom"):(conta+" é um salário ruim");
        System.out.println(r);
        sc.close();



    }
}
