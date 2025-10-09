package ATV13_Atv11;

import java.util.Random;

public class atv15 {
    public static void main(String[] args) {
        Random random = new Random();
        int temp = random.nextInt(110);
        int vibracao = random.nextInt(110);
        if (temp>90 && vibracao>80){
            System.out.println(temp+"% e "+vibracao+"% logo Máquina deve ser desligada");
        }
        else {
            if (temp<=90 && vibracao<=80){
                System.out.println(temp+"% e "+vibracao+"% logo Continuar normalmente");
            }
            else {
                System.out.println("Erro");
            }
        }
    }
}
