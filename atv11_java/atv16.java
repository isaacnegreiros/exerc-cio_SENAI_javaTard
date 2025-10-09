package atv11java;

import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Classifique o defeito como: visível, microscópico ou ausente: ");
        String r = sc.nextLine();
        if (r.equals("visível")) {
            System.out.println("O nível de defeito é alto.");
        } else {
            if (r.equals("microscópico")) {
                System.out.println("O nível de defeito é médio.");
            } else if (r.equals("ausente")) {
                System.out.println("O nível de defeito é baixo.");

            }
        }
    }
}
