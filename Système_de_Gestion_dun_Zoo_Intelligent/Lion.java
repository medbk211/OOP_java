public class Lion extends Animal implements Criable, Soignable {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void crier() {
        System.out.println("Le lion rugit !");
    }

    @Override
    public void soigner() {
        System.out.println("Le lion est soigné.");
    }

    @Override
    public void manger() {
        System.out.println("Le lion mange.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le lion se déplace.");
    }
}
