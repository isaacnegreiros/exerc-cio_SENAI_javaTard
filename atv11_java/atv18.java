package atv11java;

import java.util.Random;

public class atv18 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Quanto há de energia solar disponível? ");
        int enrg = random.nextInt(100);
        if (enrg>=70) {
            System.out.println("Enegia solar disponível: "+enrg+ ", logo: Usar energia solar");
        }
        else {
            if (enrg>30 && enrg<70) {
                System.out.println("Enegia solar disponível: "+enrg+ ", logo: Híbrido");
            } else if (enrg<=30) {
                System.out.println("Enegia solar disponível: "+enrg+", logo: Usar rede elétrica");
                
            }
        }
    }
}
