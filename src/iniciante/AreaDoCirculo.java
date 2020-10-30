/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
Entrada

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
Saída

Apresentar a mensagem "A=" seguido pelo valor da variável area, com 4 casas após o ponto decimal.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaDoCirculo {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(ir);

        double raio = 0;

        raio = Double.parseDouble(input.readLine());

        double area = 3.14159 * (raio * raio);

        System.out.println("A=" + String.format("%.4f", area));


    }

}
