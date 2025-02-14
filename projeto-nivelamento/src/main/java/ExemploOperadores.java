public class ExemploOperadores {
    public static void main(String[] args) {

        Double numero01 = 42.0;
        Double numero02 = 10.0;

        System.out.println("soma:" + (numero01 + numero02));
        System.out.println("multiplicação:" + (numero01 * numero02));

        //Operador potencia em Java
        Double resultadoPotencia = Math.pow(numero01, numero02);

        System.out.println("resultado potencia:" + resultadoPotencia);
    }
}
