public class ExemploRevisao {
    public static void main(String[] args) {

        // Tipos wrapper = são classes, ou seja, possuem métodos que ajudam :)
        // Valor inicial de wrapper = null (não tem)
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;
// Somente print
        System.out.println("Meu nome é "
                + nome + "\nminha altura é "
                + altura + "\nminha idade é "
                + idade);

// Somente interpolação
        System.out.println("Meu nome é %s, minha altura é %.2f, minha idade é %d".formatted(nome, altura, idade));

//println usando interpolação  e text block

        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do pet: %s
                
                """.formatted( nome, idade, altura, "Caramelo"));






        // Não usaremos...
        // Tipo primitivo, não são classes, sem métodos :(
        // Sempre tem valor inicial
        boolean bloqueado02 = false;
        int numero = 42;
    }

}
