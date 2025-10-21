package ATV17;

import java.util.Scanner;

// AS/RS( Sistema Automatizado de Armazenamento e Recuperação): Sistema que automatiza armazenamento e recuperação de itens.
public class atv_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prat = 0, val=0;
        do {
            System.out.println("Quantas etiquetas a prateleira " + (prat += 1) + " tem? ");
            int et1 = sc.nextInt();
            if (et1 != 0) {
                val+=1;
            }
            System.out.println(val);
        } while (val < 5);
        System.out.println("Inventário concluído");
        sc.close();
    }
}
