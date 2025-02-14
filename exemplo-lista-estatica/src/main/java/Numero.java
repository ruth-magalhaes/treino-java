public class Numero {

    public static void main(String[] args) {
        int[] numerosDaSorte = new int[3];

        numerosDaSorte[0] = 10;
        numerosDaSorte[1] = 20;


        for (int i = 0; i < numerosDaSorte.length ; i++) {

            System.out.println("número da sorte: " + numerosDaSorte[i]);

        }
String[] nomes = new String[5];

        nomes[0] = "Bob";
        nomes[1] = "Ian";
        nomes[2] = " ";
        nomes[3] = "Ana";
        nomes[4] = "Liz";

        for (int i = 0; i < nomes.length ; i++) {

            System.out.println("nomes: " + nomes[i]);

        }


        int[] numerosQueGosto = {2,6,10};
        int posicao = 4;

        if( posicao > numerosQueGosto.length || posicao < 0){

            System.out.println("N inválido");
        } else {
            System.out.println("valido");
        }

    }

}
