package bilhete;

public class BilheteUnico {

    // Atributos = caracteristicas do objeto
    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qtdVezesUsada;


    // Métodos = Comportamentos
    void carregar(Double valorDaRecarga){

        if( valorDaRecarga > 0.0) {
            saldo += valorDaRecarga;

            System.out.println("Recarga efetuada!");
        } else {
            System.out.println("Valor inválido!");
        }


    }

    Boolean usar(){

        if(saldo >= 5.0) {
            saldo -= 5.0;
            qtdVezesUsada++;
            return true;
        } else  {
            return false;
        }



    }

}
