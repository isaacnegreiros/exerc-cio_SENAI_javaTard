package Atv_17;

import java.util.Scanner;

public class atv_14 {
    public static void main(String[] args) {
        String quantity;
        Scanner sc = new Scanner(System.in);
        System.out.println("Classifique a quantidade de itens na esteira. (Baixa, Média, Grande)");
        quantity = sc.nextLine();
        String  numero = max(quantity);
        resultado (numero);}
    public static String max(String quantity){
        String resp;

        if (quantity.equalsIgnoreCase("Baixa")) {
            resp = "A velocidade da esteira está lenta.";

        }else if (quantity.equalsIgnoreCase("Média")) {
            resp = "A velocidade da esteira está regular.";

        }else{
            resp = "A velocidade da esteira está alta.";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }

}


