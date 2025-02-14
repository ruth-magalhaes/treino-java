import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {

    public static void main(String[] args) {

        // for que exibe numeros de 0 a 10

        System.out.println("For de 0 a 10");
        for(int i=0; i <= 10; i++) {
            System.out.println(i);
        }

        // While(enquanto) de 0 a 10
        System.out.println("While de 0 a 10");
        Integer contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("Terminei o While");



        // Enquanto não sortear 3, continue sorteando

        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(0,6);

        while (inteiroAleatorio !=3) {
            System.out.println("Não sorteou, sorteado:" + inteiroAleatorio);
            inteiroAleatorio = ThreadLocalRandom.current().nextInt(0,6);

        }
        System.out.println("Número Sorteado" + inteiroAleatorio);

    }
// quando eu não souber o número de parada, usa o while
}
