package ex10;

public class Lion extends Animal implements Soignable {

    public Lion(String nom) {
        super(nom);
    }

    @Override
    public void manger() {
        System.out.println("Le lion mange de la viande.");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le lion se déplace en courant.");
    }

    @Override
    public void soigner() {
        System.out.println("Le lion est soigné par le vétérinaire.");
    }

    
}
