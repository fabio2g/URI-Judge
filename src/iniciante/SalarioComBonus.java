//https://www.urionlinejudge.com.br/judge/pt/problems/view/1009

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        String nome = input.next();
        double salarioFixo = input.nextDouble();
        double vendasEfetuadas = input.nextDouble();
        double comissao = vendasEfetuadas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        input.close();


    }
}
