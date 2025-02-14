import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();

    }


    public void adicionar(Contato c){
        contatos.add(c);
    }

    public void removerPorNome(String nomeRemove){

        for (int i = 0; i < contatos.size() ; i++) {

            Contato contatoDaVez = contatos.get(i);


            if(contatoDaVez.getNome().equals(nomeRemove)){

                contatos.remove(i);

            }

        }

    }

   public void removerPorTipo(String tipoRemover){

       for (int i = 0; i < contatos.size() ; i++) {

           Contato contatoDaVez = contatos.get(i);


           if(contatoDaVez.getTipoContato().equals(tipoRemover)){

               contatos.remove(i);

           }

       }



   }

   public Integer getQuantidadeBloqueados(){
        Integer qtdBloqueados = 0;

       for (int i = 0; i < contatos.size(); i++) {
           if(contatos.get(i).getBloqueado()) {
               qtdBloqueados++;
           }
       }
      return  qtdBloqueados;
   }


   public Double somaValorDoacoes(){

        Double soma = 0.0;
        for( Contato pessoa : contatos) {

            if(pessoa.getValorDoacao()) {
                soma += somaValorDoacoes();
            }

        }


   }


}
