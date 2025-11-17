package ex10;

public class Elephant extends Animal implements Soignable {

    public Elephant(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("L'éléphant mange des plantes.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'éléphant se déplace lentement.");
    }

    @Override
    public void soigner() {
        System.out.println("L'éléphant est soigné par le vétérinaire.");
    }
    
}
