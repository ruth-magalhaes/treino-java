import java.util.ArrayList;
import java.util.List;

public class RelatorioMetodos {

    public Integer buscarQuantidadeVendas(List<Double> precos) {

       return precos.size();

    }

    public Double somarVendas(List<Double> precos) {
        Double soma = 0.0;

        for (int i = 0; i < precos.size() ; i++) {

            soma += precos.get(i);
        }
        return soma;
    }

    public Boolean buscarPreco(List<Double> precos, Double preco) {
  return precos.contains(preco);
    }

    public Double buscarMaiorPreco(List<Double> precos) {

        Double maiorPreco = precos.get(0);

        for(Double preco : precos) {

            if(preco > maiorPreco) {
                maiorPreco = preco;
            }
        }
        return maiorPreco;
    }

    public Double buscarMenorPreco(List<Double>precos) {
        Double menorPreco = precos.get(0);

        for(Double preco : precos) {

            if(preco < menorPreco ) {
                menorPreco = preco;
            }
        }
        return menorPreco;
    }

    public List<Double> buscarPorPrecoMinimo(List<Double>precos, Double precoMinimo){

        List<Double> maiorPreco = new ArrayList<>();

        for(Double preco : precos) {

            if(preco >= precoMinimo) {
                maiorPreco.add(preco);

            }

        }
        return maiorPreco;

    }


}




//A classe deve conter os seguintes métodos:
//
//buscarQuantidadeVendas: o metodo recebe a lista de precos e retorna um inteiro com a quantidade de precos contidos na lista
//somarVendas: o metodo recebe a lista de precos e retorna o valor total contido na lista
//buscarPreco: o metodo recebe a lista de precos e um preço de pesquisa, e retorna true caso exista o preço de pesquisa na lista
//buscarMaiorPreco: o metodo recebe a lista de precos e retorna o maior preço da lista
//buscarMenorPreco: o metodo recebe a lista de precos e retorna o menor preço da lista
//buscarPorPrecoMinimo: o metodo recebe a lista e um preço de filtro, e retorna uma lista apenas com preços maiores ou iguais ao valor do filtro



