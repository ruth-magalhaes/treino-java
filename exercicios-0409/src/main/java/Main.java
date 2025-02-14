import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RelatorioMetodos relatorio = new RelatorioMetodos();

        List<Double> precos = new ArrayList<>(List.of(5.2, 4.2, 9.5, 5.5, 8.7, 9.3, 4.2, 6.3, 1.5, 8.8 ));

Integer vendas = relatorio.buscarQuantidadeVendas(precos);
        System.out.println("A quantidade vendida foi de:" + vendas);

        Double soma = relatorio.somarVendas(precos);
        System.out.println("A quantidade da soma foi de:" + soma);

        Double precoQueEuQuero = 8.8;
        Boolean valorEncontrado = relatorio.buscarPreco(precos, precoQueEuQuero);
        System.out.println("O preço que eu quero é " + precoQueEuQuero + " E o encontrado é: " + valorEncontrado);

        Double precoMaior = relatorio.buscarMaiorPreco(precos);
        System.out.println("O maior preço é: " + precoMaior);

        Double precoMenor = relatorio.buscarMenorPreco(precos);
        System.out.println("O menor preço é: " + precoMenor);



    }
}