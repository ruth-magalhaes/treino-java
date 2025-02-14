public class ListaEstatica {

   private  int[] vetor;
   private  int nmrElem;


   public ListaEstatica(int capacidade){
       this.vetor = new int[capacidade];
       this.nmrElem = 0;
   }

    public void adicionar(int valor){

        if (nmrElem >= this.vetor.length) {
            System.out.println("vetor cheio");
        } else {
            nmrElem++;
        }




    }

}
