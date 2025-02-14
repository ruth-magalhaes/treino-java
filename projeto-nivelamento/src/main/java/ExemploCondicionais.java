public class ExemploCondicionais {
    public static void main(String[] args) {

        // é igual no Java
        //&, ||, <, >,
        // cuidado com ==, nunca usar para string

        String nome01 = "Bob";
        String nome02 = "Bob";


        // se fosse diferente if(!nome01.equals(nome02))
        if(nome01.equals(nome02)) {
            System.out.println("O nome é igual!");
        } else {
            System.out.println("O nome é diferente!");
        }




        Integer idade = 19;

        if(idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }


        // Operador Ternário

        String resultadoMaioridade = idade >=18 ? "Sim" : "Não";
        Boolean ehMaiorDeIdade = idade >= 18;
                System.out.println("É maior de idade:" + resultadoMaioridade);



    }
}
