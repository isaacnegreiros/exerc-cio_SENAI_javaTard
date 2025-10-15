package atividade15;

public class exerc_7 {//Uma máquina pode acelerar sua velocidade a cada 2 minutos de operação. O
    //programa deve monitorar e calcular a velocidade após cada 2 minutos, até que a
    //velocidade máxima seja atingida, que é 1000 RPM.
    public static void main(String[] args) {
        double min = 0, rpm = 0;
        while (rpm <= 1000) {
            System.out.printf("Minuto: " + min);
            System.out.println();
            System.out.println("RPM: " + rpm);
            min = min + 2;
            rpm = rpm + 1;
        }
    }
}