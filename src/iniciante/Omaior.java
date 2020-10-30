package iniciante;//https://www.urionlinejudge.com.br/judge/pt/problems/view/1013

import java.util.Scanner;

import static java.lang.Math.abs;

public class Omaior {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int maiorAB = (A + B + abs( A - B)) / 2;

        if (maiorAB > C){
            System.out.println(maiorAB + " eh o maior");

        }else{
            System.out.println(C + " eh o maior");

        }

        in.close();
    }
}
