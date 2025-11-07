package Atv_18;

import java.util.Scanner;

public class atv_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Insira a idade que quer verificar: ");
        idade = sc.nextInt();
        String resultado = ClassificadorIdade(idade);
        result(resultado);
    }
    public static String ClassificadorIdade(int idade) {
        String classe= " ";
        if (idade!=0 && idade<=12) {
            classe = "Infantil";
        } else if (idade!=0 && idade>=13 && idade<18) {
            classe= "Adolescente";
        } else if (idade!=0 && idade>=18 && idade<60) {
            classe = "Adulto";
        } else if (idade!=0 && idade>=60) {
            classe = "Idoso";
        }
        return classe;
    }
    public static void result(String resultado) {
        System.out.println("A Classe dessa idade é: "+resultado);
    }
}
