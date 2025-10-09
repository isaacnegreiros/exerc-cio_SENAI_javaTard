package atv11java;

import java.util.Random;

public class atv1 {
    public static void main(String[] args) {
        Random r = new Random();
        int c = r.nextInt(3);
        if (c == 1 && c != 0) {
            System.out.println("o robo esta na pista " + c + " entao deve seguir para frente");
        } else {
            if (c == 2 && c != 0) {
                System.out.println("o robo esta na pista " + c + " entao deve seguir para a direita");
            } else {
                if (c == 3 && c != 0) {
                    System.out.println("o robo esta na pista " + c + " entao deve seguir a esquerda");
                }
                else {
                    System.out.println("Valor 0, logo sem comandos");
                }
            }
        }

    }
}
