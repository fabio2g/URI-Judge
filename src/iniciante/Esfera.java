//https://www.urionlinejudge.com.br/judge/pt/problems/view/1011

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double raio = in.nextDouble();

        double volume = (4 / 3.0) * 3.14159 * (raio * raio * raio);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

        in.close();
    }
}
