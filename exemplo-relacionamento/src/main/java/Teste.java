public class Teste {

    public static void main(String[] args) {

        Musica musica01 = new Musica("billie jean", "Michael Jackson", 4.50);
        musica01.curtir();
        musica01.curtir();
        musica01.curtir();

        Musica musica02 = new Musica("Toxicity", "System", 9.50);
        musica02.curtir();
        musica02.curtir();

        Album album01 = new Album("Top's anos 90", 2);
        album01.adicionarMusica(musica01);



        Album album02 = new Album("Favoritas", 10);
        album02.adicionarMusica(musica01);
        album02.adicionarMusica(musica02);

        System.out.println("exibindo por likes: ");
        album02.

    }


}
