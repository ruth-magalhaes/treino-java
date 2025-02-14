import java.util.Scanner;

public class Calculando {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer escolha;

        do {

            System.out.println("Escolha a operação matemática que deseja realizar:");
            System.out.println("01 - Quero Somar");
            System.out.println("02 - Quero Subtrair");
            System.out.println("03 - Quero Multiplicar");
            System.out.println("04 - Sair");
            System.out.println("-----------------------------------");

            escolha = scan.nextInt();


            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu pela operação SOMAR ;)");
                    System.out.println("Digite o primeiro número:");
                    Double numero1 = scan.nextDouble();
                    System.out.println("Digite o segundo número:");
                    Double numero2 = scan.nextDouble();
                    System.out.println("Resultado: " + (numero1 + numero2));

                    break;

                case 2:
                    System.out.println("Você escolheu pela operação Subtrair ;)");
                    System.out.println("Digite o primeiro número:");
                    numero1 = scan.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numero2 = scan.nextDouble();
                    System.out.println("Resultado: " + (numero1 - numero2));

                    break;

                case 3:
                    System.out.println("Você escolheu pela operação Multiplicar ;)");
                    System.out.println("Digite o primeiro número:");
                    numero1 = scan.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numero2 = scan.nextDouble();
                    System.out.println("Resultado: " + (numero1 * numero2));

                    break;

                case 4:
                    System.out.println("Agora você irá sair do programa! Até breve! ");

                    break;

            }

        } while (!escolha.equals(4));

        scan.close();
    }
    }

