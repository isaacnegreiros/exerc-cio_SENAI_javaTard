package ATV17;

import java.util.Scanner;

//OEE(Overall Equipment Effectiveness): Indicador que mede a eficiência de um equipamento.
public class atv_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char resp;
        int ciclos, paradas;
        double t1=0,t2=0;
        do {
            System.out.println("Insira os ciclos: ");
            ciclos = sc.nextInt();
            System.out.println("Insira as paradas: ");
            paradas = sc.nextInt();
            System.out.println("Deseja encerrar(s/n)? ");
            resp = sc.next().toLowerCase().charAt(0);
            t1+= ciclos;
            t2+= paradas;
        }while(resp!='s');
        double dispo= t1/(t1+t2);
        System.out.printf("Disponibilidade: %.2f%n", dispo);
    }
}
