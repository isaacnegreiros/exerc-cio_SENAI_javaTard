package atv17;

import java.util.Scanner;

public class atv_4 {
    static void main() {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu cargo: (Operador básico , Supervisor , Engenheiro)?");
        a = sc.nextLine();
        String cargo = max(a);
        resultado(cargo);
    }

    public static String max(String a) {
        String resp;

        if (a.equalsIgnoreCase("operador básico") || a.equalsIgnoreCase("operador basico")) {
            resp = "Acesso restrito.";
        } else if (a.equalsIgnoreCase("supervisor")) {
            resp = "Acesso parcial.";
        } else if (a.equalsIgnoreCase("engenheiro")) {
            resp = "Acesso total.";
        } else {
            resp = "Cargo inválido. Acesso negado.";
        }

        return resp;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}