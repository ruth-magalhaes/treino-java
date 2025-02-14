import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TreinoExercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nomeUsuario = scan.nextLine();
        System.out.println("Digite o valor do prêmio: ");
        Double valorPremio = scan.nextDouble();
        if( valorPremio >= 0.5 && valorPremio <= 5000) {
            Integer numeroSorte = ThreadLocalRandom.current().nextInt(1,101);
            System.out.println("Seu número da sorte é:" + numeroSorte);

            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,101);
            Integer tentativas = 0;

            while (!numeroSorte.equals(numeroSorteado)){
                numeroSorteado = ThreadLocalRandom.current().nextInt(1,101);
                tentativas++;
            }

            if(tentativas == 1) {
                System.out.println("Seu premio será de R$" + valorPremio);
            } else if(  tentativas <=5) {
                System.out.println("Seu premio será de R$" + valorPremio * 0.9);

            } else if (tentativas <= 10) {
                System.out.println("Seu premio será de R$" + valorPremio * 0.5);

            } else if (tentativas >= 11) {
                System.out.println("Voce não receberá o premio" );


            }

        }

    }
}


/*Crie uma classe Java NaoJogueTigrinho a qual:

a) Solicite ao usuário seu nome

b) Solicite o valor do prêmio quantas vezes forem necessárias até que o valor seja entre 0,50 e 5000. Sempre que for informado um valor inválido, exiba "Prêmio deve ser entre R$0,50 e $5.000,00".

c) Sorteie o número da sorte do usuário, que deve ser entre 1 e 100. Exibe o número da sorte.

        d) Faça quantos sorteios forem necessários até que seja sorteado o número da sorte. O prêmio final do usuário será:

        100% do valor informado em b) caso seja sorteado na 1a tentativa.
        90% do valor informado em b) caso seja sorteado entre a 2a e a 5a tentativas.
        50% do valor informado em b) caso seja sorteado na 6a e a 10a tentativas.
        0% do valor informado em b) caso seja sorteado a partir da 11a tentativa.

e) Exiba o resultado final numa frase como esta:
Olá, A. Seu número foi sorteado na Xa tentativa. Seu prêmio será de R$Y.
Onde A é o nome do usuário, X é a tentativa e Y é o valor líquido do prêmio, conforme a regra descrita em d).*/