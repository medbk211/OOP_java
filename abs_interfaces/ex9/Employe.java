package ex9;

public abstract class Employe implements Affichable {
    protected String nom;
    protected String id;

    public Employe(String nom, String id) {
        this.nom = nom;
        this.id = id;
    }

    public abstract double calculerSalaire();

    @Override
    public void afficherDetails() {
        System.out.printf("%s (id=%s) salaire=%.2f%n", nom, id, calculerSalaire());
    }
}
