public class Oiseau extends Animal implements Criable, Soignable {
    public Oiseau(String name, int age) {
        super(name, age);
    }

    @Override
    public void crier() {
        System.out.println("L'oiseau chante !");
    }

    @Override
    public void soigner() {
        System.out.println("L'oiseau est soigné.");
    }

    @Override
    public void manger() {
        System.out.println("L'oiseau mange.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau vole.");
    }
    
}
