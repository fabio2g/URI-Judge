//https://www.urionlinejudge.com.br/judge/pt/problems/view/1015

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double p1 = x2 - x1;
        double p2 = y2 - y1;

        double distancia = Math.sqrt((p1 * p1) + (p2 * p2));

        System.out.println(String.format("%.4f", distancia));

        in.close();
    }
}
