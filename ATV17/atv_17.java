package ATV17;

import java.util.Scanner;
//RMS(Raiz Quadrada Média): é a medida do volume de um sinal de áudio ao longo de um período.
public class atv_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leitura=0,total=0,menor=0,vibracao=0;

        do {
            System.out.println("Digite o nível de vibração: "+(vibracao+=1));
            double lvl = sc.nextDouble();
            total++;
            if (lvl<2.5){
                menor++;
            }else {
                menor=0;
            }
        } while(menor<3);
        System.out.println("Leituras totais: "+total);
    sc.close();}
}
