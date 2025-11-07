package atividade18;

import java.util.Scanner;

public class atv2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de conversão que deseja realizar:\n" +
                "------------------------------------\n" +
                "Célcius para fahrenheit\n" +
                "Fahrenheit para célcius\n" +
                "------------------------------------");
        String type = sc.nextLine();

        String[] vect = type.split(" ");
        String p1 = vect[0];
        String p3 = vect[2];

        System.out.print("Insira a temperatura: ");
        double temp = sc.nextInt();

        String direction = max(p3, temp);

        showResult(direction);
        sc.close();
    }
    public static String max(String p3, double temp){

        if (p3.equalsIgnoreCase("célcius")) {
            double result = temp * 1.8 + 32;
            System.out.println("A temperatura em fahrenheit é:" + result + "°F");
        } else if (p3.equalsIgnoreCase("fahrenheit")) {
            double result = (temp - 32) / 1.8;
            System.out.println("A temperatura em graus celsius é:" + result + "°C");
        }
        return p3;
    }
    public static void showResult(String res){
    }
}
