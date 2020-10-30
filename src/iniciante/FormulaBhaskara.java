package iniciante;

//https://www.urionlinejudge.com.br/judge/pt/problems/view/1036

import java.util.Locale;
import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        if (A == 0) {
            System.out.println("Impossivel calcular");

        } else {
            double raiz = Math.sqrt((B * B) - (4 * A * C));
            double x1 = (-B + raiz) / (2 * A);
            double x2 = (-B - raiz) / (2 * A);

            if (raiz > 0) {
                System.out.println("R1 = " + String.format("%.5f", x1));
                System.out.println("R2 = " + String.format("%.5f", x2));

            } else {
                System.out.println("Impossivel calcular");

            }

        }

        in.close();
    }
}
