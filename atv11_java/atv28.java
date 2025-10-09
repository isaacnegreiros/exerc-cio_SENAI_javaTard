package atv11;

import java.util.Scanner;

public class atv28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo de rota?");
        String rota = sc.nextLine();
        if (rota.equals("bloqueada")){
            System.out.println("recalcular a rota");
        }else{
            if (rota.equals("transito alto")){
                System.out.println("rota alternativa");
            }
            if (rota.equals("Senão")){
                System.out.println("seguir rota normal");
            }
        }

    }
}
