package atv20;

import java.util.Scanner;

public class atv_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê a linha de e-mails separados por vírgula
        System.out.println("Digite os e-mails separados por vírgula: ");
        String contas = sc.nextLine();

        // Divide a string em um vetor de e-mails usando split
        String[] emails = contas.split(",");

        // Processa cada e-mail: trim e toLowerCase
        for (int i = 0; i < emails.length; i++) {
            emails[i] = emails[i].trim().toLowerCase();
        }

        // Imprime todos os e-mails
        System.out.println("Todos os e-mails: ");
        for (String email : emails) {
            System.out.println(email);
        }

        // Cria um vetor auxiliar para armazenar e-mails únicos
        String[] emailsUnicos = new String[emails.length];
        int contadorUnicos = 0;

        // Verifica e-mails únicos
        for (String email : emails) {
            boolean repetido = false;
            for (int i = 0; i < contadorUnicos; i++) {
                if (email.equals(emailsUnicos[i])) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                emailsUnicos[contadorUnicos] = email;
                contadorUnicos++;
            }
        }

        // Imprime os e-mails únicos
        System.out.println("e-mails únicos: ");
        for (int i = 0; i < contadorUnicos; i++) {
            System.out.println(emailsUnicos[i]);
        }

        sc.close();
    }
}



