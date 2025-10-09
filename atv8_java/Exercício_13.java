package ATV13_Atv08;

import java.util.Scanner;

public class Exercício_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanta energia solar resta?");
        double enrg = sc.nextDouble();
        if (enrg<200){
            System.out.println("Acionar energia auxiliar");
        }
        else {
            System.out.println("Energia solar suficietne");
        }
    }
}
