package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double N1 = in.nextDouble(); //peso 2
        double N2 = in.nextDouble(); //peso 3
        double N3 = in.nextDouble(); //peso 4
        double N4 = in.nextDouble(); //peso 1

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / ((2 + 3 + 4 + 1));
        System.out.println("Media: " + String.format("%.1f", media));

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        }
        if (media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        if(media > 5.0 && media < 6.9){
            System.out.println("Aluno em exame.");

            double notaExame = in.nextDouble();
            System.out.println("Nota do exame: " + String.format("%.1f", notaExame));

            media = (notaExame + media) /2;

            if(media >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f", media));

            } else if ( media < 4.9) {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + String.format("%.1f", media));

            }
        }

        in.close();
    }
}
