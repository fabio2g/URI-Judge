package iniciante;/*
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA.
A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da
igualdade seguido pelo valor correspondente à soma de A e B.
Como */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomaSimples {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(ir);

        int A, B, SOMA;

        A = Integer.parseInt(input.readLine());
        B = Integer.parseInt(input.readLine());

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

    }
}
