package atv11java;

import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a acidez do produto? ");
        double pH = sc.nextDouble();
        if (pH<7) {
            System.out.println("O produto é ácido");
        }
        else {
            if (pH==7) {
                System.out.println("O produto é neutro");
            } else if (pH>7) {
                System.out.println("O produto é básico");

            }
        }
        sc.close();
    }
}
