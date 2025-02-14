import java.util.Scanner;

public class ProjetoTeste {

    public static void main(String[] args) {

        // criando um objeto para utilizar seus métodos
        MetodosUteis metodosLegais = new MetodosUteis();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nomeUsuario = leitor.nextLine();

       metodosLegais.exibirUsuario(nomeUsuario);





    }
}
