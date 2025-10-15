package ATV15_While;

public class Exercício_09 {
    public static void main(String[] args) {
        double wts = 1000,aumento=0;
        int hr = 60;
        while(hr<=300) {
            System.out.println(wts+" watts");
            aumento= wts*0.1;
            wts= wts+aumento;
            hr +=60;
        }
    }
}
