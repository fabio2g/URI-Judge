package iniciante;

import java.time.Duration;

public class ConversaoDeTempo {
    public static void main(String[] args) {

        long input = 5418;
        Duration duracao =  Duration.ofSeconds(input);
        long horas = duracao.toHours();
        long minutos = duracao.minusHours(horas).toMinutes();
        long segundos = duracao.minusHours(horas).minusMinutes(minutos).getSeconds();
        System.out.printf(horas + " : " + minutos + " : " + segundos);

    }
}
