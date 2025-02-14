import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //parametro = argumento

        //sempre que eu coloco new, vira um objeto
        //toda classe possui um metodo
//leitor.nextDouble() e leitor.nextInt()
        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();
        System.out.println("Digite sua idade:");
        Integer idadeUsuario = leitor.nextInt();
        System.out.println("Digite sua altura:");
        Double alturaUsuario = leitor.nextDouble();


        System.out.println("""
                Seja bem vindo(a), %s
                sua idade é: %d
                sua altura é %.2f""".formatted(nomeUsuario, idadeUsuario, alturaUsuario ));

    }
}
