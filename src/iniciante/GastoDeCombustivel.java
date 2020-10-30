//https://www.urionlinejudge.com.br/judge/pt/problems/view/1017

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int tempoViagem = in.nextInt();
        int velocidadeMedia = in.nextInt();

        double litros = (velocidadeMedia * tempoViagem) / 12.0;

        System.out.println(String.format("%.3f",litros));



        in.close();
    }
}
