import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProdutoSimples {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(ir);

        int PROD, A, B;

        A = Integer.parseInt(input.readLine());
        B = Integer.parseInt(input.readLine());

        PROD = A * B;

        System.out.println("PROD = " + PROD);

    }
}

