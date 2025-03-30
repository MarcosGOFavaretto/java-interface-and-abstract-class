public class Papagaio extends Animal {

    public Papagaio() {
        super(false);
    }

    @Override
    public void lavar() {
        System.out.println();
        System.out.println("Pegar o pó para limpeza de aves");
        System.out.println("Abanar o papagaio");
    }
}