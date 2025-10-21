package ATV17;

import java.util.Scanner;

public class atv_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = 0, R = 0, r = 0;
        int num=0;
        char amostra;
        System.out.println("Digite o resultado das 10 amostras, sendo A = aprovado e R = recusado: ");
        while(r<10){
            do {
                System.out.println("Digite a amostra "+(num+=1)+":");
                amostra = sc.next().toUpperCase().charAt(0);
                if (amostra=='A') {
                    A++;
                } else if (amostra=='R') {
                    R++;

                }
                r = A + R;
            } while (amostra !='A' && amostra !='R');
        }
        System.out.println("A: " + A);
        System.out.println("R: " + R);
        sc.close();
    }
}
