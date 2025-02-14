package sptech;

import java.util.Arrays;

public class ListaEstatica {

    // 01) Declarar vetor de int:
    // É inicializado no construtor
    private int[] vetor;
    // 02) Criar atributo nroElem:
    // Tem dupla função: representa quantos elementos foram adicionado no vetor
    // Também o índice de onde será adicionado o próximo elemento
    private int nroElem;

    // 03) Criar Construtor:
    // Recebe como argumento o tamanho máximo do vetor
    // Cria vetor com tamanho máximo informado
    // Inicializa nroElem
    public ListaEstatica(int tam) {
        this.vetor = new int[tam];
        this.nroElem = 0;
    }

    public ListaEstatica() {
         // Default para 10 elementos
    }

    // 04) Método adiciona:
    // Recebe o elemento a ser adicionado na lista
    // Se a lista estiver cheia usar IllegalStateException();
    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            throw new IllegalStateException("VETOR CHEIO!");
        } else {
            vetor[nroElem] = elemento;
            nroElem++;
        }
    }

    // 05) Método busca:
    // Recebe o elemento a ser procurado na lista
    // Retorna o índice do elemento, se for encontrado
    // Retorna -1 se não encontrou
    public int busca(int elementoProcurado) {
        for (int i = 0; i < vetor.length; i++) { // Só itera até nroElem
            if (vetor[i] == elementoProcurado) {
                return i;
            }
        }
        return -1;
    }

    // 06) Método removePeloIndice:
    // Recebe o índice do elemento a ser removido
    // Se o índice for inválido, retorna false
    // Se removeu, retorna true
    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= vetor.length) {
            return false; // Índice inválido
        }

        // Remove deslocando os elementos para esquerda
        for (int i = indice; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        // Decrementa o número de elementos e "limpa" o último valor
        nroElem--;
        vetor[nroElem -1] = 0;

        return true;
    }

    // 07) Método removeElemento:
    // Recebe um elemento a ser removido
    // Utiliza os métodos busca e removePeloIndice
    // Retorna false, se não encontrou o elemento
    // Retorna true, se encontrou e removeu o elemento
    public boolean removeElemento(int elemento) {
        int indice = busca(elemento);
        if (indice == -1) {
            return false; // Elemento não encontrado
        }
        return removePeloIndice(indice);
    }

    // 08) Método exibe:
    // Exibe os elementos da lista
    public void exibe() {
        if (nroElem == 0) {
            System.out.println("Lista vazia!");
        } else {
            System.out.print("Elementos da lista: ");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println();
        }
    }

    // Métodos getVetor e getNroElem
    // São usados nos testes
    public int getNroElem() {
        return nroElem;
    }

    public int[] getVetor() {
        return vetor; // Retorna apenas os elementos válidos
    }
}