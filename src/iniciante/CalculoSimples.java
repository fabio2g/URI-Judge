//https://www.urionlinejudge.com.br/judge/pt/problems/view/1010

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int cod1 = in.nextInt();
        int numPecas1 = in.nextInt();
        double valorUnit1 = in.nextDouble();
        double valor1 = numPecas1 * valorUnit1;

        int cod2 = in.nextInt();
        int numPecas2 = in.nextInt();
        double valorUnit2 = in.nextDouble();
        double valor2 = numPecas2 * valorUnit2;

        double resultado = valor1 + valor2;

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", resultado));

        in.close();
    }
}
