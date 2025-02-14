package school.sptech.ex2;

public class Encomenda {
   String tamanho;
   String enderecoRemetente;
   String enderecoDestinatario;
   Double distancia;
   Double valorProduto;


   Double calcularFrete(){
       Double freteCal = valorProduto;

       if(tamanho.equals("P")){
           freteCal *= 0.01;
       } else if (tamanho.equals("M")) {
           freteCal *= 0.03;
       } else if (tamanho.equals("G")) {
           freteCal *= 0.05;
       } else {
           System.out.println("Tamanho Inválido!");
       }

       if(distancia <= 50){
           freteCal += 3.00;
       } else if(distancia <= 200) {
           freteCal += 5.00;
       } else if (distancia > 200)  {
           freteCal += 7.00;
       }
return freteCal;
   }

    void aplicarCupomDeDesconto(Integer porcentualDesc) {
       Double valorDesc = (valorProduto * porcentualDesc)/100;
       valorProduto -= valorDesc;


   }


   Double valorTotalDaEncomenda() {
Double frete = calcularFrete();
return valorProduto + frete;

   }


}


