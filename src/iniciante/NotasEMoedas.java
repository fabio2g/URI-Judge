package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double valorMonetario = in.nextDouble();

        double notas100 = valorMonetario / 100.0;
        double resto100 = valorMonetario % 100.0;

        double notas50 = resto100 / 50.0;
        double resto50 = resto100 % 50.0;

        double notas20 = resto50 / 20.0;
        double resto20 = resto50 % 20.0;

        double notas10 = resto20 / 10.0 ;
        double resto10 = resto20% 10.0;

        double notas5 = resto10 / 5.0;
        double resto5 = resto10 % 5.0;

        double notas2 = resto5 / 2.0;
        double resto2 = resto5 % 2.0;

        double moeda1 = resto2 / 1.0;
        double restoMoeda1 = resto2 % 1.0;

        double moeda50 = restoMoeda1 / 0.5;
        double restoMoeda50 = restoMoeda1 % 0.5;

        double moeda25 = restoMoeda50 / 0.25;
        double restoMoeda25 = restoMoeda50 % 0.25;

        double moeda10 = restoMoeda25 / 0.10;
        double restoMoeda10 = restoMoeda25 % 0.10;

        double moeda5 = restoMoeda10 / 0.05;
        double restoMoeda5 = restoMoeda10 % 0.05;

        double moeda01 = restoMoeda5 / 0.01;

        System.out.println("NOTAS:");
        System.out.println((int) notas100 + " nota(s) de R$ 100.00");
        System.out.println((int) notas50 + " nota(s) de R$ 50.00");
        System.out.println((int) notas20 + " nota(s) de R$ 20.00");
        System.out.println((int) notas10 + " nota(s) de R$ 10.00");
        System.out.println((int) notas5 + " nota(s) de R$ 5.00");
        System.out.println((int) notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int) moeda1 + " moeda(s) de R$ 1.00");
        System.out.println((int) moeda50 + " moeda(s) de R$ 0.50");
        System.out.println((int) moeda25 + " moeda(s) de R$ 0.25");
        System.out.println((int) moeda10 + " moeda(s) de R$ 0.10");
        System.out.println((int) moeda5 + " moeda(s) de R$ 0.05");
        System.out.println((int) moeda01 + " moeda(s) de R$ 0.01");

        in.close();

    }
}
