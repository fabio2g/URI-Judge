//https://www.urionlinejudge.com.br/judge/pt/problems/view/1016

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int distancia = in.nextInt();

        int minutos = distancia * 2;

        System.out.println(minutos + " minutos");


        in.close();
    }
}
