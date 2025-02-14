public class MetodosUteis {
    // Metodo possui retorno ou void se não houver retorno. Possui nome e pode receber argumentos.
    // retorno: void sem retorno
    //nome:exibirUsuario
    //argumentos: nomeUsuario
    // corpo: faz um print enfeitado com o nome

    void exibirUsuario(String nomeUsuario) {
        System.out.println("""
                *-----------------------------------*
                Usuário: %s
                *-----------------------------------*
                """.formatted(nomeUsuario));
    }


    Double somar(Double num01, Double num02) {
        return num01 + num02;
    }

}
