public class Teste {

    public static void main(String[] args) {
        Carro carro01 = new Carro("Bob da Silva", "fiat", 1999, 0.5, true);
        Bicicleta bike01 = new Bicicleta("JP", "caloi", 1980, 0.8);
        Moto moto01 = new Moto("Mel", "top", 2023, false);
        // classe abstrata nã permite instancia
        carro01.exibirRelatorio();
        bike01.exibirRelatorio();
        moto01.exibirRelatorio();

    }
}
