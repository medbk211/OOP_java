package ex10;

public class Oiseau extends Animal implements Soignable {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("L'oiseau mange des graines.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau se déplace en volant.");
    }

    @Override
    public void soigner() {
        System.out.println("L'oiseau est soigné par le vétérinaire.");
    }
    
}
