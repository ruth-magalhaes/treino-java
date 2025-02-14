public class Teste {
    public static void main(String[] args) {

        MetodosDivertidos metodos = new MetodosDivertidos();
        Integer sorteio = metodos.avaliandoSorte(6);
        if(sorteio <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if(sorteio <= 10) {
            System.out.println("Você é sortudo");
        } else if(sorteio > 10) {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }

Integer sortear = metodos.exibeSomaSorteio();
        System.out.println("A soma dos\n" +
                "números é " + sortear);


        metodos.exibeImpares();

Integer posicao = metodos.posicaoSorteio(9);

if(posicao == -1) {
    System.out.println("O número escolhido não foi sorteado!");
}


    }



}
