import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        listaEstranha.add(true);
        listaEstranha.add("Bob");
        listaEstranha.add(42);

        List<String> nomes = new ArrayList<>();
        nomes.add("Bob da Silva");
        nomes.add("Maria Eduarda");
        nomes.add("José Pedro");

        System.out.println("Segundo nome da lista: " + nomes.get(1));

        for (int i = 0; i <  nomes.size(); i++) {
            System.out.println("""
                    Nome %d: %d""".formatted(nomes.get(i)));
        }
// Principais métodos da lista no Java: add(), size(retorna tamanho), get(busca o elemento //por indice), remove(remove elemento por indice), isEmpty(retorna true se a lista está //vazia), clear(limpa a lista), set(altera o elemento por indice)


    }
}
