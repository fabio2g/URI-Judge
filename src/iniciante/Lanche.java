//https://www.urionlinejudge.com.br/judge/pt/problems/view/1038

package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        int codigo = in.nextInt();
        int quantidade = in.nextInt();
        double total;

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                System.out.println("Total: R$ " + String.format("%.2f",total));
                break;

            case 2:
                total = quantidade * 4.50;
                System.out.println("Total: R$ " + String.format("%.2f",total));
                break;

            case 3:
                total = quantidade * 5.00;
                System.out.println("Total: R$ " + String.format("%.2f",total));
                break;

            case 4:
                total = quantidade * 2.00;
                System.out.println("Total: R$ " + String.format("%.2f",total));
                break;

            case 5:
                total = quantidade * 1.50;
                System.out.println("Total: R$ " + String.format("%.2f",total));
                break;

            default:

        }

        in.close();

    }
}
