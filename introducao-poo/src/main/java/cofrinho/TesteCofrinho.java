package cofrinho;

public class TesteCofrinho {
    public static void main(String[] args) {
        Cofrinho cofre = new Cofrinho(100.5, true,"viagem");

        Cofrinho reserva01 = new Cofrinho(50.8, true, "viagem");



        reserva01.saldo = 80.0;
        reserva01.quebrado = true;
        reserva01.meta = "Viagem";

        reserva01.agitar(5.8);
        System.out.println(reserva01.agitar(8.2));



        Cofrinho reserva02 = new Cofrinho(50.2,true, "carro");

      reserva02.saldo = 75.0;
      reserva02.quebrado = false;
      reserva02.meta = "Compras";

        Cofrinho reserva03 = new Cofrinho(20.2,true, "casa");

        reserva03.saldo = 75.0;
        reserva03.quebrado = false;
        reserva03.meta = "Compras";


    }
}
