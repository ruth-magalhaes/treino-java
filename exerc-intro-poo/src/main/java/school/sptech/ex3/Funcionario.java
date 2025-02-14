package school.sptech.ex3;

public class Funcionario {

    String nome;
    String cargo;
    Double salario;


    void reajustarSalario(Integer porcReajuste) {
        Double valor = salario * porcReajuste / 100;
        salario += valor;


    }

    Double calcularValorHora() {
        Double tblhoHora = salario / 220;
        return tblhoHora;
    }

    Double calcularHoraExtra(Integer qtdHoraExtra, Integer porAdicionalNoturno) {

        Double valorPorHora = calcularValorHora();
        Double valorHoraExtra = qtdHoraExtra * valorPorHora * (1 + porAdicionalNoturno / 100.0);
        return valorHoraExtra;


        }

    }