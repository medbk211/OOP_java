public class Elephant extends Animal implements Criable, Soignable {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void crier() {
        System.out.println("L'éléphant barrit !");
    }

    @Override
    public void soigner() {
        System.out.println("L'éléphant est soigné.");
    }

    @Override
    public void manger() {
        System.out.println("L'éléphant mange.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'éléphant se déplace.");
    }
    
}
