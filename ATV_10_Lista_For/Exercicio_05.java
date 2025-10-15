package eucasa;

import java.util.Random;

public class atv5 {
    static void main() {
        Random random = new Random();
        int maq = 10 , r=0, soma=0,horas=0;
        for (int x = 1; x <= maq; x++) {
            r= random.nextInt(10);// numero aleatorio
            System.out.println("a maquina numero "+x+" consome por hora"+r+"kWh");
            soma+=r;// soma(0) igual a 0+r( armazenado as variaveis randonicas
        } horas=soma*24;
        System.out.println("o total de consumo em 24h das maquinas é de: "+horas+"kWh");
    }
}
