//https://www.urionlinejudge.com.br/judge/pt/problems/view/1035

package iniciante;

import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int par = A % 2;

        if (B > C && D > A && (C + D) > (A +B) && C >= 0 && D >= 0 && par == 0){
            System.out.println("Valores aceitos");

        } else{
            System.out.println("Valores nao aceitos");
        }

        in.close();
    }
}
