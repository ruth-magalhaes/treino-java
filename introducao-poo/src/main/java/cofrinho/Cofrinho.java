package cofrinho;

import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {

    // Atributos = caracteristicas do objeto
private Double saldo;
private Boolean quebrado;
private String meta;

// metodo vs construtor:
    //precisa especificar etorno X construtor não possui
    //padrão de nomes: camelCase X PascalCase
    //qualquer nome X Mesmo nome da classe
    //chama quando quiser X chama na instancia
    //Parecidos:
    // estrutura: recebe argumentos e faz algo
    // tambem pode ser sobrecarregado


    public Cofrinho(Double saldo, Boolean quebrado, String meta) {
        this.saldo = saldo;
        this.quebrado = quebrado;
        this.meta = meta;
    }

    public Cofrinho(Double saldo, Boolean quebrado) {
        this.meta = "não possui";
        this.saldo = saldo;
        this.quebrado = quebrado;
    }

    // Métodos = Comportamentos


    void depositar(Double valor) {
        if(quebrado){
            System.out.println("O cofrinho está quebrado! Você não pode realizar depósitos");
        } else {
            saldo += valor;
            System.out.println("O valor depositado foi de R$ " + valor + "Seu saldo é de R$" + saldo);
        }

    }


Double agitar(Double aleatorio) {

        if(!quebrado) {

           aleatorio = ThreadLocalRandom.current().nextDouble(0, saldo);

           saldo = saldo - aleatorio;
            return saldo;

        }
        return  null;
}

Boolean quebrar() {
        if(!quebrado) {
            quebrado = true;
            System.out.println("O cofrinho tinha R$" + saldo);
        }
return null;
}


}





//O programa deve capacitar o usuário a depositar uma determinada quantia de dinheiro no cofrinho escolhido. No entanto, essa operação não será possível caso o cofrinho já esteja quebrado.
//
//Além disso, o usuário terá a opção de agitar o cofrinho, retornando para o usuário um valor aleatório entre 0 e o valor total contido no cofrinho, caso não esteja quebrado.
//
//O programa também deve permitir ao usuário quebrar um cofrinho específico, o que resultara na devolução de todo dinheiro contido cofrinho. Caso ainda não tenha sido quebrado