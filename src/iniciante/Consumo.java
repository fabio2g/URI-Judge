package iniciante;//https://www.urionlinejudge.com.br/judge/pt/problems/view/1014

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        //distância percorrida pelo carro em KM
        int X = in.nextInt();
        //quantidade de litros gasto pelo carro
        double Y = in.nextDouble();

        double comsumo = X / Y;

        System.out.println(String.format("%.3f", comsumo) + " km/l");

        in.close();
    }
}

