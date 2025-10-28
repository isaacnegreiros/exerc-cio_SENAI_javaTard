package atv17;

import java.util.Scanner;

public class atv_9 {
    static void main() {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a porcentagem de defeito do lote: ");
        temp = sc.nextInt();
        String defeito = max(temp);
        resultado(defeito);
    }

    public static String max(int temp) {
        String resp = "";


        if (temp >= 10) {
            resp = "Acione alerta;";
        } else if (temp <= 10) {
            resp = "lote aprovado";

        }
        return resp;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
