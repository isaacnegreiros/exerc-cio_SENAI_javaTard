package atv11;

import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int particulas;
        System.out.println("Qual a quantidade de particulas?");
        particulas = sc.nextInt();
        if (particulas < 50) {
            System.out.println("bom");
        } else {
            if (particulas <= 100) {
                System.out.println("moderado");
            }
            if (particulas>100 && particulas <= 200) {
                System.out.println("ruim");
            }
            if (particulas > 200) {
                System.out.println("critico");
            }
        }
    }
}