package atividade17;

import java.util.Scanner;

public class atv_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int particulas;
        System.out.println("Qual a quantidade de particulas?");
        particulas = sc.nextInt();
        String qualidadeUm = qualidade(particulas);
        result(qualidadeUm);
    }

    public static String qualidade(int particulas) {
        String resultado=" ";
        if (particulas<=50) {
            resultado = "Bom";
        }else {
            if (particulas<100) {
                resultado = "Moderado";
            } else {
                if (particulas>=100 && particulas <= 200) {
                    resultado = "Ruim";
                } else {
                    if (particulas>200) {
                        resultado = "Crítico";
                    }
                }
            }
        }
        return resultado;
    }

    public static void result(String retorno) {
        System.out.println(retorno);
    }
}

