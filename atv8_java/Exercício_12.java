package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Quanto é a eficiência da produção? ");
        double ef = sc.nextDouble();
        if (ef>=85){
            System.out.println("Eficiência aceitável");
        }
        else {
            System.out.println("Manutenção Recomendada");
        }
    }
}
