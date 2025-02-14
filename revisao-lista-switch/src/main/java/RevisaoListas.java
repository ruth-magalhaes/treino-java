import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {
    public static void main(String[] args) {
//        List<String> frutas = new ArrayList<>();
//        frutas.add("Laranja");
//        frutas.add("Goiaba");
//
//        System.out.println(frutas);


        //lista imútaval, os valores dela não poderão ser manipulados
//      List<String> frutasImutaveis = List.of("Laranja", "Goiaba");
//        System.out.println(frutasImutaveis);

        List<String> frutasMutavel = new ArrayList<>(List.of("Laranja", "Goiaba", "Limão"));
        frutasMutavel.add("Uva");
//        System.out.println(frutasMutavel);
//
//        //substituir
//        frutasMutavel.set(2, "Melancia");
//        System.out.println(frutasMutavel);
//
//        //remover
//        System.out.println(frutasMutavel.get(0));
//        frutasMutavel.remove(0);
//        frutasMutavel.remove("Limão");

        for (int i = 0; i < frutasMutavel.size() ; i++) {
            System.out.println(frutasMutavel.get(i));

        }
        System.out.println("Lista for aprimorado");
        for(String frutaDaVez : frutasMutavel) {
            System.out.println(frutaDaVez);
        }





    }
}
