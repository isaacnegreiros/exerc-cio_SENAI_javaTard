package atv8;

import java.util.Scanner;

public class atv9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double m;
        System.out.println("digite a quantidade de materiais:");
        m = sc.nextDouble();
        if (m>0) {
            System.out.println("impressao iniciada");
        }
        else {
            System.out.println("sem material disponivel");
        }
    }
}
