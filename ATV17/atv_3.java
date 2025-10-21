package ATV17_DoWhile;

import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String codigo;

        do {
            System.out.print("Digite o código RFID: ");// RFID significa Radio Frequency Identification (em português, Identificação por Radiofrequência). Por meio dela, podemos fazer a identificação individual de cada produto, registrar informações técnicas e rastrear a mercadoria.
           codigo= sc.nextLine();
        } while (codigo.length() != 8 );

        System.out.println("Código aceito");

        }

    }

