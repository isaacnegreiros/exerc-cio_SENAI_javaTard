package ATV15_While;


public class Exercício_08 {
    public static void main(String[] args) {
        int pecas = 500,limite=10000;
        double falha = 2.5;
        while (pecas<=limite) {
            System.out.println("De "+pecas+" peças, há "+falha+" falhas.");
            pecas += 500;
            falha += 2.5;

        }
        System.out.println();

    }
}
