package Atv_17;

import java.util.Scanner;

public class atv_15 {
    public static void main(String[] args) {
        double temp, vib;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a temperatura da máquina: ");
        temp = sc.nextDouble();

        System.out.print("Insira a vibração da máquina: ");
        vib = sc.nextDouble();

        String temperatura = max(temp, vib);
        resultado(temperatura);
    }

    public static String max(double temp, double vibration) {
        String resp;

        if (temp > 90 || vibration > 80) {
            resp = " Emergência! Desligar imediatamente.";
        } else {
            resp = " Funcionamento normal.";
        }
        return resp;
    }

    public static void resultado(String resp) {
        System.out.println(resp);
    }
}


