package Atv_17;

import java.util.Scanner;

public class atv_17 {
    public static void main(String[] args) {
        String robotA, robotB;
        Scanner sc = new Scanner(System.in);
        System.out.println("O robô A está funcionando?");
        robotA = sc.nextLine();
        System.out.println("O robô B está funcionando?");
        robotB = sc.nextLine();
        String robo = max(robotA,robotB);
        resultado(robo);
    }

        public static String max(String robotA,String robotB){
        String resp="";

        if (robotA.equalsIgnoreCase("Sim")) {
            if (robotB.equalsIgnoreCase("Sim")) {
                resp = "Adicionar robô A.";
            }
            else {
                resp = "Adicionar robô A.";
            }
        }
        else if (robotB.equalsIgnoreCase("Sim")) {
            if (robotA.equalsIgnoreCase("Não")) {
                resp = "Adicionar robô B.";
            }
        }
        else {
            resp = "Parar a linha.";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}



