package atv17;

import java.util.Scanner;

public class atv_10 {
    static void main() {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a temperatura: ");
        temp = sc.nextInt();
        String temperatura = max(temp);
        resultado(temperatura);
    }

    public static String max(int temp) {
        String resp;

        if (temp < 0) {
            resp = "Alerta de congelamento.";
        } else if (temp >= 0 && temp <= 40) {
            resp = "Normal.";
        } else {
            resp = "Alerta de superaquecimento.";
        }
        return resp;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
