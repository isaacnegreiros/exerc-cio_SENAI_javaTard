package atv8;

import java.util.Scanner;

public class atv10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double arm;
        System.out.println("digite o peso das caixas:");
        arm = sc.nextDouble();
        if (arm>500) {
            System.out.println("peso excedido");}
        else {
            System.out.println("peso dentro do limite");
        }
    }
}
