public class Main {

    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.lavar();
        meuAnimal.tosar();
        meuAnimal.alimentar();
        meuAnimal.acariciar();

        meuAnimal = new Gato();
        meuAnimal.lavar();
        meuAnimal.tosar();
        meuAnimal.alimentar();
        meuAnimal.acariciar();

        meuAnimal = new Papagaio();
        meuAnimal.lavar();
        meuAnimal.alimentar();
        meuAnimal.acariciar();

    }
}