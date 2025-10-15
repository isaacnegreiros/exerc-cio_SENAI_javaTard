package ATV15_While;


public class Exercício_10 {
    public static void main(String[] args) {
        int falha = 0;
        int tempo = 1;
        while (tempo<=5) {
            if (falha<=5) {
                falha++;
                System.out.println("Falha detectada: "+falha);
            }
            tempo++;
        }
        System.out.println();
        System.out.println("O sistema detectou 5 falhas consecutivas.");
        System.out.println();
        System.out.println("O Sistema foi desligado.");
    }
}
