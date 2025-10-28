package atv17;

import java.util.Scanner;

public class atv_3 {
    static void main() {
        int energy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a energia restante da máquina.");
        energy = sc.nextInt();
        String energia = max(energy);
        resultado(energia);
    }

    public static String max(int energy) {
        String resp;

        if (energy < 30) {
            resp = "Entrando no modo econômico.";
        } else if (energy >= 30 && energy <= 70) {
            resp = "Entrando no modo normal.";
        } else {
            resp = "Entrando no modo turbo.";
        }
        return resp;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
