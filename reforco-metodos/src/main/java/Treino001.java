import java.util.concurrent.ThreadLocalRandom;

public class Treino001 {

public Integer avaliando( Integer num ){
    Integer sortear = ThreadLocalRandom.current().nextInt(0,11);
    Integer qtdTent = 1;
    while(!sortear.equals(num)) {
        sortear = ThreadLocalRandom.current().nextInt(0,11);
        qtdTent++;
    }
return qtdTent;
}

public Integer exibe() {

    Integer ale = ThreadLocalRandom.current().nextInt(0,11);
    Integer soma = 0;
    while (!ale.equals(0)) {
        ale = ThreadLocalRandom.current().nextInt(0,11);
        soma += ale;
    }
return soma;
}

 public void  impar() {

    for (int i = 0; i <= 90 ; i++) {

        if(i % 2 != 0) {
            System.out.println(i);
        }
    }
}

public Integer posi(Integer num) {
    Integer aleat;


    for (int i = 0; i < 200 ; i++) {
        aleat = ThreadLocalRandom.current().nextInt(0,101);

        if(aleat.equals(num)) {
            return i;
        }
        
    }
    return -1;
}



}



