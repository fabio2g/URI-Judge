package iniciante;//https://www.urionlinejudge.com.br/judge/pt/problems/view/1006

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Media2 {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double A, B, C;

        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());

        double MEDIA = (((A * 2) + (B * 3) + (C * 5)) / ((2 + 3 + 5)));

        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));

    }
}
