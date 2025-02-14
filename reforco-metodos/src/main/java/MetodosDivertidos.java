import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {


    public Integer avaliandoSorte(Integer numero) {

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer qtdTentetivas = 1;

        while (numeroAleatorio != numero) {
            qtdTentetivas++;
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);

        }
        return qtdTentetivas;
    }

    public Integer exibeSomaSorteio() {
        Integer sorteio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer soma = 0;

        while (!sorteio.equals(0)) {
            soma += sorteio;
            sorteio = ThreadLocalRandom.current().nextInt(0, 11);

        }
        return soma;
    }


    public void exibeImpares() {

        for (int i = 0; i <= 90; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }


    public Integer posicaoSorteio(Integer valor) {

        Integer numeroAleatorio;

        for (int i = 0; i < 200; i++) {

            numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);

            if(numeroAleatorio.equals(valor)) {
                return i;
            }

        }
return  -1;

    }
}