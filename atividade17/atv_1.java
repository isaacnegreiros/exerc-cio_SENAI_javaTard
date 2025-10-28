package Atv_17;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        String direction;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para qual direção deseja seguir? (frente, direita, esquerda).");
        direction = sc.nextLine();
        String diracao=max(direction);
        resultado(direction);}
        public static String max( String direction) {
            String resp;

            if (direction.equalsIgnoreCase("Frente")) {
                resp = "Movendo para frente.";
            } else if (direction.equalsIgnoreCase("direita")) {
                resp = "Movendo para a direita.";
            } else {
                resp = "Movendo para a esquerda.";
            }return resp;
        }public static void resultado(String resp){
        System.out.println(resp);
    }
}


