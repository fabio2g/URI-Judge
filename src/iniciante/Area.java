package iniciante;//https:www.urionlinejudge.com.br/judge/pt/problems/view/1012

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo));

        in.close();
    }
}
