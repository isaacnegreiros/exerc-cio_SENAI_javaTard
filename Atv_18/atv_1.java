package Atividade18;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite qual operação deseja:");
        System.out.println("* somar");
        System.out.println("* subtrair");
        System.out.println("* multiplicar");
        System.out.println("* dividir");

        String operacao = sc.nextLine();

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();
        String numero=Calculadora(n1,n2,operacao);
        resultado(numero);}
        public static String Calculadora(int n1, int n2, String operacao){
        String resp;

        if (operacao.equalsIgnoreCase("somar")) {
            resp="Resultado: " + (n1 + n2);

        } else if (operacao.equalsIgnoreCase("subtrair")) {
           resp="resultado:"+(n1-n2);

        } else if (operacao.equalsIgnoreCase("multiplicar")) {
           resp="resultado:"+(n1*n2);

        }if (operacao.equalsIgnoreCase("dividir")){
           resp="resultado:"+n1/n2;
        }else{
           resp="falha!!";
        }return resp;
    }public static void resultado(String resp){
        System.out.println(resp);
    }
}
