//https://www.urionlinejudge.com.br/judge/pt/problems/view/1005

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Media1 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double A, B, MEDIA;

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());

        //calcula de media ponderada
        MEDIA = ((A * 3.5) + (B * 7.5)) / ((3.5 + 7.5));

        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));

    }
}
