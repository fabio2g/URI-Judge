//https://www.urionlinejudge.com.br/judge/pt/problems/view/1037

package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double valor = in.nextDouble();

        if (valor >= 0 && valor <= 25.0) {
            System.out.println("Intervalo [0,25]");

        }
        if (valor >= 25.01 && valor <= 50.0) {
            System.out.println("Intervalo (25,50]");

        }
        if (valor >= 50.01 && valor <= 75.0) {
            System.out.println("Intervalo (50,75]");

        }
        if (valor >= 75.01 && valor <= 100) {
            System.out.println("Intervalo (75,100]");

        }if ( valor < 0){
            System.out.println("Fora de intervalo");

        }
        if(valor > 100){
            System.out.println("Fora de intervalo");

        }

        in.close();
    }
}
