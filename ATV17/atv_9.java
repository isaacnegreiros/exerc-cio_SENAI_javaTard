package ATV17;

import java.util.Scanner;

public class atv9 {//processar novamente algo que já foi processado.
    static void main() {
        Scanner sc =  new Scanner(System.in);
        String resultado;
        int tentativas = 0;

        do{
            System.out.println("Resultado do  teste (true/false): ");
            resultado = sc.nextLine().trim().toLowerCase();
            tentativas++;
        }while (!resultado.equals("true"));

        System.out.println("Numero de tentativas até o acerto : "+ tentativas);


    }
}
