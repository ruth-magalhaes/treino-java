package school.sptech.ex1;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;


    void venderBolo(Integer quantidade) {


        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeVendida += quantidade;
            quantidadeEmEstoque -= quantidade;
            System.out.println("Bolo vendido, ainda há " + quantidadeEmEstoque + " bolos no estoque");
        } else {
            System.out.println("Venda indisponível");
        }

    }


    void aumentarEstoque(Integer qtdAdicionada) {
        if (qtdAdicionada > 0) {
            qtdAdicionada += quantidadeEmEstoque;
            System.out.println("Você tem em seu estoque " + qtdAdicionada + " bolos");
        } else {
            System.out.println("Opção inválida!");
        }

    }
}








