//https://www.urionlinejudge.com.br/judge/pt/problems/view/1008

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salario {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int funcionario, horasTrabalhadas;
        double valorHora;

        funcionario =Integer.parseInt(in.readLine());
        horasTrabalhadas = Integer.parseInt(in.readLine());
        valorHora = Double.parseDouble(in.readLine());


        double salario = horasTrabalhadas * (valorHora);

        System.out.println("NUMBER = " + funcionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));


    }
}
