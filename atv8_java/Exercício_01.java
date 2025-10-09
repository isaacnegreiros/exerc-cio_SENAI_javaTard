package ATV13_Atv08;

import java.util.Locale;
import java.util.Scanner;

public class Exercício_01 {
    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Qual a temperatura?");
        temp = sc.nextDouble();
        if(temp>=80) {
            System.out.println("Alerta, máquina desligada por superaquecimento!");
        }
        else {
            if (temp<80) {
                System.out.println("Máquina operando normalmente.");
            }
            }
        }

    }
