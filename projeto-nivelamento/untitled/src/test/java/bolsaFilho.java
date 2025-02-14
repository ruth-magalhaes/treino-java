public class bolsaFilho {

    public static void main(String[] args) {

        Integer filhosDe0a3 = 4;
        Integer filhosDe4a16 = 6;
        Integer filhosDe17a18 = 2;

        Double valorBolsaAte4Anos = 25.12;
        Double valorBolsaDe4a16Anos = 15.88;
        Double valorBolsaDe17a18Anos = 12.44;

        Integer totalFilhos = (filhosDe0a3 + filhosDe4a16 + filhosDe17a18);
        Double qtdTotal = ((filhosDe0a3 * valorBolsaAte4Anos) + (filhosDe4a16 * valorBolsaDe4a16Anos) + (filhosDe17a18 * valorBolsaDe17a18Anos));

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber " + qtdTotal + " de bolsa");

    }

}
