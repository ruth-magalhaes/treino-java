public class Treino002 {
    public static void main(String[] args) {
        Treino001 treinar = new Treino001();
        Integer boraSortear = treinar.avaliando(2);

        if(boraSortear <= 3) {
            System.out.println("sortudaaa");
        } else if (boraSortear <= 10) {
            System.out.println("sortudaaa. arrasou!!!");

        } else if(boraSortear > 10) {
            System.out.println("parou, parou!");

        }


   Integer exe2 = treinar.exibe();
        System.out.println("A soma dos números é " + exe2);



treinar.impar();


Integer exe4 = treinar.posi(7);

if(exe4 == -1) {
    System.out.println("nao foi sorteado!");
} else {
    System.out.println("foi sorteado!");
}
    }


}
