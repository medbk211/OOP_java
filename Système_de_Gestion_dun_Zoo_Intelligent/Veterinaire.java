public class Veterinaire extends Personnel implements Travailleur {
    
    public Veterinaire(String nom) {
        super(nom);
    }

    @Override
    public void presentation() {
        System.out.println("Je suis un vétérinaire nommé " + getNom() + ".");
    }

    @Override
    public void travailler() {
        System.out.println("Le vétérinaire travaille en soignant les animaux.");
    }
}