public abstract class Animal implements IAnimal {

    private boolean hasPelo = false;

    public Animal(boolean hasPelo) {
        this.hasPelo = hasPelo;
    }

    public void lavar() {
        System.out.println();
        System.out.println("Pegar o shampoo");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Lavando ...");
        System.out.println("Secar");
    }

    public void tosar() {

        if (hasPelo) {
            System.out.println();
            System.out.println("Ligar a máquinha.");
            System.out.println("Tosando ...");
            System.out.println("Tosando ...");
            System.out.println("Tosando ...");
            System.out.println("Desligar a máquinha.");
        }

    }

    public void alimentar() {
        System.out.println();
        System.out.println("Pegar a ração");
        System.out.println("Alimentando ...");
        System.out.println("Guardar a ração");
    }

    public void acariciar() {
        System.out.println();
        System.out.println("Colocando a mão sobre o animal!");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Acariciando ...");
        System.out.println("Tirando a mão do animal!");
    }

}