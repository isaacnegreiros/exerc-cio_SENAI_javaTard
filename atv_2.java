package atv17;

import java.util.Scanner;

public class atv_2 {
    static void main() {
        String state;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o estado do lote de produção? (aprovado, reprovado, retrabalho, análise manual)");
        state = sc.nextLine();
        String producao=max(state);
        resultado(producao);}
        public static String max(String state){
        String resp;


        if (state.equalsIgnoreCase("Aprovado")) {
            resp="O lote de produção está aprovado.";

        } else if (state.equalsIgnoreCase("Reprovado")) {
           resp="O lote de produção está reprovado.";
        } else if (state.equalsIgnoreCase("Retrabalho")) {
          resp="O lote de produção deve ser retrabalhado.";
        } else {
            resp="O lote de produção passará por uma análise manual.";
        } return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}
