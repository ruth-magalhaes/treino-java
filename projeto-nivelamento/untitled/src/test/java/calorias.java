public class calorias {

    public static void main(String[] args) {

        Integer aquecimento = 15;
        Integer aerobico = 30;
        Integer musculacao = 60;

        Integer caloriasAquecimento = 12;
        Integer caloriasAerobico = 20;
        Integer caloriasMusculacao = 25;

        Integer calQueimadaAquec = (aquecimento * caloriasAquecimento);
        Integer calQueimadaAerob = (aerobico * caloriasAerobico);
        Integer calQueimadaMuscu = (musculacao * caloriasMusculacao);


        Integer totalMinutos = (aquecimento + aerobico + musculacao);
        Integer totalCalorias = (calQueimadaAquec + calQueimadaAerob + calQueimadaMuscu);

        System.out.println("Olá, Jorge. Você fez um total de " + totalMinutos + " minutos de exercícios e perdeu " + totalCalorias + " calorias" );

    }

}
