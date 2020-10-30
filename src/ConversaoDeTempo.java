//https://www.urionlinejudge.com.br/judge/pt/problems/view/1019

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int segundosQualquer = in.nextInt();

        int horas = segundosQualquer / 3600;
        int minutos = (segundosQualquer % 3600) / 60;
        int segundos = (segundosQualquer % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        in.close();
    }
}